package artistry.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
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

import artistry.enums.Role;
import artistry.models.person.PersonRole;
import artistry.repositories.RolesRepository;
import artistry.services.ArtistryCsvReader;

@Configuration
@RestController
@Description("Controller to for handling roles that people play)")
@RequestMapping("/role")
public class PersonRoleRestController {

	static final Logger log = LoggerFactory.getLogger(PersonRoleRestController.class);

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
		PersonRole savedrole = roleRepo.save(personRole);
		return savedrole;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PersonRole updatePersonRole(@RequestBody PersonRole personRole) {
		PersonRole savedrole = roleRepo.save(personRole);
		return savedrole;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deletePersonRole(@PathVariable("id") Long id) {
		Optional<PersonRole> personRole = roleRepo.findById(id);
		if (personRole.isPresent()) {
			roleRepo.delete(personRole.get());
		}
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
	private String createBaseRoles() throws URISyntaxException, IOException {
		// parse the csv file
		csvReader.readRolesCsv();
		return "Import of roles complete";
	}


}
