package artistry.controllers;

import artistry.models.Program;
import artistry.repositories.ProgramRepository;
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
@Description("Controller to manage programs")
@RequestMapping("/program")
class ProgramRestController {
	
	static final Logger log = LoggerFactory.getLogger(ProgramRestController.class);

	@Autowired
	private ProgramRepository progRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Program> getAll() {
		return progRepo.findAll();
	}
	
	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Program> getAllByName(@PathVariable("name") String name) {
		return progRepo.findByProgramName(name);
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Program> getById(@PathVariable("id") Long id) {
		return progRepo.findById(id);
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Program createProgram(@RequestBody Program program) {
		return progRepo.save(program);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Program updateProgram(@RequestBody Program program) {
		return progRepo.save(program);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteProgram(@PathVariable("id") Long id) {
		Optional<Program> program = progRepo.findById(id);
		program.ifPresent(program1 -> progRepo.delete(program1));
	}
}
