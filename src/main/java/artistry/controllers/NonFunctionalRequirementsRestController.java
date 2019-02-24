package artistry.controllers;

import artistry.models.NonFunctionalRequirement;
import artistry.repositories.NonFunctionalRequirementRepository;
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
@Description("Controller to for handling non functional requirements")
@RequestMapping("/nfr")
class NonFunctionalRequirementsRestController {
	
	static final Logger log = LoggerFactory.getLogger(NonFunctionalRequirementsRestController.class);

	@Autowired
	private NonFunctionalRequirementRepository nfrRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<NonFunctionalRequirement> getAll() {
		return nfrRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<NonFunctionalRequirement> getAllById(@PathVariable("id") Long id) {
		return nfrRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private NonFunctionalRequirement create(@RequestBody NonFunctionalRequirement nfr) {
		return nfrRepo.save(nfr);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private NonFunctionalRequirement update(@RequestBody NonFunctionalRequirement nfr) {
		return nfrRepo.save(nfr);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void delete(@PathVariable("id") Long id) {
		Optional<NonFunctionalRequirement> nfr = nfrRepo.findById(id);
		nfr.ifPresent(nonFunctionalRequirement -> nfrRepo.delete(nonFunctionalRequirement));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		nfrRepo.deleteAll();

	}


}
