package artistry.controllers;

import artistry.models.LargeSolution;
import artistry.repositories.LargeSolutionRepository;
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
@Description("Controller to manage large solutions")
@RequestMapping("/largesolution")
class LargeSolutionRestController {

	static final Logger log = LoggerFactory.getLogger(LargeSolutionRestController.class);

	@Autowired
	private LargeSolutionRepository largeRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<LargeSolution> getAll() {
		return largeRepo.findAll();
	}
	
	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<LargeSolution> getAllByName(@PathVariable("name") String name) {
		return largeRepo.findByLargeSolutionName(name);
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<LargeSolution> getById(@PathVariable("id") Long id) {
		return largeRepo.findById(id);
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private LargeSolution createLargeSolution(@RequestBody LargeSolution ls) {
		return largeRepo.save(ls);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private LargeSolution updateLargeSolution(@RequestBody LargeSolution ls) {
		return largeRepo.save(ls);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteLargeSolution(@PathVariable("id") Long id) {
		Optional<LargeSolution> ls = largeRepo.findById(id);
		ls.ifPresent(largeSolution -> largeRepo.delete(largeSolution));
	}
	
}
