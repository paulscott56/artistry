package artistry.controllers;

import artistry.enums.Role;
import artistry.models.PersonRole;
import artistry.repositories.RolesRepository;
import artistry.services.ArtistryCsvReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@Configuration
@RestController
@Description("Controller to for handling roles that people play)")
@RequestMapping("/role")
class RolesRestController {

	static final Logger log = LoggerFactory.getLogger(RolesRestController.class);

	@Autowired
	private RolesRepository roleRepo;
	
	@Autowired 
	private ArtistryCsvReader csvReader;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<PersonRole> getAll() {
		return roleRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<PersonRole> getAllById(@PathVariable("id") Long id) {
		return roleRepo.findById(id);
	}

	@RequestMapping(value = "/getbyrole/{role}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<PersonRole> getAllById(@PathVariable("role") Role role) {
		return roleRepo.findByRole(role);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PersonRole createPersonRole(@RequestBody PersonRole personRole) {
		return roleRepo.save(personRole);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PersonRole updatePersonRole(@RequestBody PersonRole personRole) {
		return roleRepo.save(personRole);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deletePersonRole(@PathVariable("id") Long id) {
		Optional<PersonRole> personRole = roleRepo.findById(id);
		personRole.ifPresent(personRole1 -> roleRepo.delete(personRole1));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAllPersonRole() {
		roleRepo.deleteAll();

	}
	
	@RequestMapping(value = "/setuproles", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private String createBaseRoles() throws IOException {
		// parse the csv file
		csvReader.readRolesCsv();
		// TODO: Make a proper response object for all these one liner messages.
		return "Import of roles complete";
	}


}
