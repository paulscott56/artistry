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

import artistry.models.geo.Continent;
import artistry.repositories.ContinentRepository;

@Configuration
@RestController
@Description("Controller to manage continents")
@RequestMapping("/continent")
public class ContinentRestController {

	static final Logger log = LoggerFactory.getLogger(ContinentRestController.class);

	@Autowired
	private ContinentRepository coRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Continent> getAll() {
		return coRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Continent> getAllById(@PathVariable("id") Long id) {
		return coRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Continent create(@RequestBody Continent continent) {
		return coRepo.save(continent);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Continent update(@RequestBody Continent continent) {
		return coRepo.save(continent);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<Continent> continent = coRepo.findById(id);
		if (continent.isPresent()) {
			coRepo.delete(continent.get());
		}
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		coRepo.deleteAll();

	}
}
