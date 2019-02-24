package artistry.controllers;

import artistry.models.MajorCity;
import artistry.repositories.MajorCityRepository;
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
@Description("Controller to for handling cities")
@RequestMapping("/city")
public class MajorCityRestController {
	
	static final Logger log = LoggerFactory.getLogger(MajorCityRestController.class);

	@Autowired
	private MajorCityRepository cityRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<MajorCity> getAll() {
		return cityRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<MajorCity> getAllById(@PathVariable("id") Long id) {
		return cityRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private MajorCity create(@RequestBody MajorCity city) {
		return cityRepo.save(city);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private MajorCity update(@RequestBody MajorCity city) {
		return cityRepo.save(city);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<MajorCity> city = cityRepo.findById(id);
		city.ifPresent(majorCity -> cityRepo.delete(majorCity));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		cityRepo.deleteAll();

	}

}
