package artistry.webhook;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import artistry.models.Destination;
import artistry.models.WebHookMessage;
import artistry.repositories.DestinationRepository;
import artistry.repositories.MessageRepository;

/**
 * example code
 * https://github.com/oscarcosta/vh-hs-webhook/tree/master/src/main/java/com/hootsuit/webhook
 * 
 * @author paul
 *
 */
@Service
class MessageProcessor {

	private static final Logger log = LoggerFactory.getLogger(MessageProcessor.class);

	@Autowired
	private MessageRepository messageRepository;

	@Autowired
	private DestinationRepository destinationRepository;

	private final RestTemplate restTemplate;

	public MessageProcessor(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * Async EventListener for MessageReceivedEvent
	 */
	@Async
	@EventListener
	public void messageReceivedListener(MessageReceivedEvent messageReceivedEvent) {
		WebHookMessage message = messageReceivedEvent.getWebHookMessage();
		log.info("Listening Event for Message {}", message.getId());
		processMessagesForDestination(message.getDestination());
	}

	/**
	 * Scheduled method to process the messages saved in database
	 */
	@Scheduled(cron = "0 * * * * *") // (cron = "0 0 */6 * * *") // Run at minute 0 past every 6th hour.
	public void scheduledMessagesProcessor() {
		log.debug("Executing scheduled message processor at {}", new Date(System.currentTimeMillis()));
		destinationRepository.findAll().forEach(this::processMessagesForDestination);
	}

	private void processMessagesForDestination(Destination destination) {
		try {
			log.debug("Processing messages for Destination {}", destination.getUrl());
			destinationRepository.setDestinationOnline(destination.getId());

			Iterable<WebHookMessage> messages = messageRepository.findAll(); // ByDestination(destination);
			for (WebHookMessage message : messages) {
				if (message.isMessageTimeout() || message.getTimestamp() == null || message.getRetryCount() > 5) {
					deleteMessage(message);
				} else {
					sendMessage(message);
				}
			}
		} catch (MessageProcessorException ex) {
			log.info("processMessagesForDestination caught an exception: {}", ex.getMessage());
		}
	}

	private void sendMessage(WebHookMessage message) throws MessageProcessorException {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set(HttpHeaders.CONTENT_TYPE, message.getContentType());
			HttpEntity<String> request = new HttpEntity<>(message.getMessageBody(), headers);

			Thread.sleep(500); // wait 0.5 second before send message

			log.info("Sending Message {} to Destination {}", message.getId(), message.getDestinationUrl());

			ResponseEntity<String> entity = restTemplate.postForEntity(message.getDestinationUrl(), request,
					String.class);

			if (entity.getStatusCode().equals(HttpStatus.OK)) {
				onSendMessageSuccess(message);
			} else {
				throw new MessageProcessorException("Non 200 HTTP response code!");
			}
		} catch (Exception ex) {
			log.info("sendMessage caught an exception: {}", ex.getMessage());
			onSendMessageError(message);
			throw new MessageProcessorException(ex.getMessage());
		}
	}

	private void onSendMessageSuccess(WebHookMessage message) {
		log.debug("Sent Message {}", message.getId());
		deleteMessage(message);
	}

	private void onSendMessageError(WebHookMessage message) {
		log.info("Unsent Message {}", message.getId());
		message.setRetryCount(message.getRetryCount() + 1);
		destinationRepository.setDestinationOffline(message.getDestination().getId());
		messageRepository.save(message);
	}

	private void deleteMessage(WebHookMessage message) {
		messageRepository.deleteById(message.getId());
		log.info("Deleted Message {}", message.getId());
	}

}
