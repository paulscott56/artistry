package artistry.controllers;

import artistry.models.EmailAddress;
import artistry.repositories.EmailAddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Configuration
@RestController
@Description("Controller to manage email addresses")
@RequestMapping("/emailaddress")
class EmailAddressRestController {

	static final Logger log = LoggerFactory.getLogger(EmailAddressRestController.class);

	@Autowired
	private EmailAddressRepository emailRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<EmailAddress> getAll() {
		return emailRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<EmailAddress> getAllById(@PathVariable("id") Long id) {
		return emailRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private EmailAddress create(@RequestBody EmailAddress email) {
		return emailRepo.save(email);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private EmailAddress update(@RequestBody EmailAddress email) {
		return emailRepo.save(email);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<EmailAddress> email = emailRepo.findById(id);
		email.ifPresent(emailAddress -> emailRepo.delete(emailAddress));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		emailRepo.deleteAll();

	}
}
