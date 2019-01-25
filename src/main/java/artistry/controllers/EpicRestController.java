package artistry.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.train.Epic;
import artistry.repositories.EpicRepository;

@Configuration
@RestController
@Description("Controller to manage epics")
@RequestMapping("/epic")
public class EpicRestController {
	
	static final Logger log = LoggerFactory.getLogger(EpicRestController.class);

	@Autowired
	private EpicRepository epicRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Epic> getAll() {
		return epicRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Epic> getAllById(@PathVariable("id") Long id) {
		return epicRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Epic create(@RequestBody Epic epic) {
		return epicRepo.save(epic);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Epic update(@RequestBody Epic epic) {
		return epicRepo.save(epic);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<Epic> epic = epicRepo.findById(id);
		if (epic.isPresent()) {
			epicRepo.delete(epic.get());
		}
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		epicRepo.deleteAll();

	}
}
