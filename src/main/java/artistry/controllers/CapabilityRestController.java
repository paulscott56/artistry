package artistry.controllers;

import artistry.models.Capability;
import artistry.repositories.CapabilityRepository;
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
@Description("Controller to for handling capabilities (master features)")
@RequestMapping("/capability")
class CapabilityRestController {
	
	static final Logger log = LoggerFactory.getLogger(CapabilityRestController.class);
	
	@Autowired
	private CapabilityRepository capRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Capability> getAll() {
		return capRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Capability> getAllById(@PathVariable("id") Long id) {
		return capRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Capability createCapability(@RequestBody Capability capability) {
		return capRepo.save(capability);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Capability updateCapability(@RequestBody Capability capability) {
		return capRepo.save(capability);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteCapability(@PathVariable("id") Long id) {
		Optional<Capability> capability = capRepo.findById(id);
		capability.ifPresent(capability1 -> capRepo.delete(capability1));
	}
	
	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		capRepo.deleteAll();

	}

}