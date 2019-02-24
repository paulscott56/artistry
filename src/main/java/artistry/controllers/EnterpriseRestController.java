package artistry.controllers;

import artistry.models.Enterprise;
import artistry.repositories.EnterpriseRepository;
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
@Description("Controller to manage enterprises")
@RequestMapping("/enterprise")
public class EnterpriseRestController {

	static final Logger log = LoggerFactory.getLogger(EnterpriseRestController.class);

	@Autowired
	private EnterpriseRepository enterRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Enterprise> getAll() {
		return enterRepo.findAll();
	}

	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Enterprise> getAllByName(@PathVariable("name") String name) {
		return enterRepo.findByEnterpriseName(name);
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Enterprise> getAllById(@PathVariable("id") Long id) {
		return enterRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
		Enterprise savedenterprise = enterRepo.save(enterprise);
		return savedenterprise;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Enterprise updateEnterprise(@RequestBody Enterprise enterprise) {
		Enterprise savedenterprise = enterRepo.save(enterprise);
		return savedenterprise;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteEnterprise(@PathVariable("id") Long id) {
		Optional<Enterprise> enterprise = enterRepo.findById(id);
		enterprise.ifPresent(enterprise1 -> enterRepo.delete(enterprise1));
	}

	
	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		enterRepo.deleteAll();

	}

}
