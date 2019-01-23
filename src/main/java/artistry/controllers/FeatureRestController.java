package artistry.controllers;

import java.util.Date;
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

import artistry.models.train.Feature;
import artistry.repositories.FeatureRepository;

@Configuration
@RestController
@Description("Controller to for handling features")
@RequestMapping("/feature")
public class FeatureRestController {
	
	static final Logger log = LoggerFactory.getLogger(FeatureRestController.class);
	
	@Autowired
	private FeatureRepository featureRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Feature> getAll() {
		return featureRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Feature> getAllById(@PathVariable("id") Long id) {
		return featureRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Feature create(@RequestBody Feature feature) {
		feature.setCreationDate(new Date());
		return featureRepo.save(feature);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Feature update(@RequestBody Feature feature) {
		feature.setLastModificationDate(new Date());
		return featureRepo.save(feature);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<Feature> feature = featureRepo.findById(id);
		if (feature.isPresent()) {
			featureRepo.delete(feature.get());
		}
	}
	
	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		featureRepo.deleteAll();

	}
}