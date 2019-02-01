package artistry.controllers;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.Destination;
import artistry.models.WebHookMessage;
import artistry.repositories.DestinationRepository;
import artistry.repositories.MessageRepository;
import artistry.webhook.MessageReceivedEvent;

@Configuration
@RestController
@Description("Controller to webhook destinations")
@RequestMapping("/webhook")
public class OutgoingWebHookRestController implements ApplicationEventPublisherAware {

	static final Logger log = LoggerFactory.getLogger(OutgoingWebHookRestController.class);

	private ApplicationEventPublisher applicationEventPublisher;

	@Autowired
	private DestinationRepository destinationRepository;

	@Autowired
	private MessageRepository messageRepository;

	@RequestMapping(value = "/destinations", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Long registerNewDestination(@RequestParam("url") String url) {
		validateParam(url, "url");
		Destination destination = destinationRepository.save(new Destination(url));
		log.info("Received Destination {}", url);
		return destination.getId();
	}

	@RequestMapping(value = "/destinations", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Destination> listDestinations() {
		log.info("Listing Destinations");
		return destinationRepository.findAll();
	}

	/**
	 * Delete a destination by id
	 */
	@DeleteMapping("/destinations/{id}")
	public void deleteDestination(@PathVariable("id") Long id) {
		Destination destination = getDestination(id);
		destinationRepository.deleteById(id);
		log.info("Deleted Destination {}", destination.getUrl());
	}

	/**
	 * POST a message to this destination
	 */
	@PostMapping("/destinations/{id}/message")
	public void postMessageToDestination(@PathVariable("id") Long id, @RequestBody String body,
			@RequestHeader("Content-Type") String contentType) {
		validateParam(body, "body");
		Destination destination = getDestination(id);
		WebHookMessage message = messageRepository.save(new WebHookMessage(body, contentType, destination));
		log.info("Received Message {} for Destination {}", message.getId(), message.getDestinationUrl());
		// Publishes the received message's event
		applicationEventPublisher.publishEvent(new MessageReceivedEvent(this, message));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;

	}

	private Destination getDestination(Long id) throws NoSuchElementException {
		Optional<Destination> destination = destinationRepository.findById(id);
		if (!destination.isPresent()) {
			throw new NoSuchElementException("Does not exist destination with ID " + id);
		}
		return destination.get();
	}

	private void validateParam(String param, String paramName) throws IllegalArgumentException {
		if (param == null || param.isEmpty()) {
			throw new IllegalArgumentException("The '" + paramName + "' must not be null or empty");
		}
	}

}
