package artistry.controllers;

import artistry.models.PhoneNumber;
import artistry.repositories.PhoneNumberRepository;
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
@Description("Controller to for handling phone number objects")
@RequestMapping("/phone")
class PhoneNumberRestController {

	static final Logger log = LoggerFactory.getLogger(PhoneNumberRestController.class);

	@Autowired
	private PhoneNumberRepository repo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<PhoneNumber> getAll() {
		return repo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<PhoneNumber> getAllById(@PathVariable("id") Long id) {
		return repo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PhoneNumber create(@RequestBody PhoneNumber phone) {
		return repo.save(phone);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PhoneNumber update(@RequestBody PhoneNumber phone) {
		return repo.save(phone);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<PhoneNumber> phone = repo.findById(id);
		phone.ifPresent(phoneNumber -> repo.delete(phoneNumber));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		repo.deleteAll();

	}

}