package artistry.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import artistry.enums.Role;
import artistry.exceptions.StorageFileNotFoundException;
import artistry.models.geo.Country;
import artistry.models.person.Person;
import artistry.models.person.PersonRole;
import artistry.repositories.CountryRepository;
import artistry.repositories.PersonRepository;
import artistry.repositories.RolesRepository;
import artistry.services.ArtistryCsvReader;
import artistry.utils.StorageService;

@Configuration
@RestController
@Description("Controller to set up and maintain representations of people within the environment")
@RequestMapping("/person")
public class PersonRestController {

	static final Logger log = LoggerFactory.getLogger(PersonRestController.class);

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private RolesRepository rolesRepo;

	@Autowired
	private ArtistryCsvReader csvReader;

	@Autowired
	private StorageService storageService;

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Person createPerson(@RequestBody Person person) {
		try {
			Country country = countryRepo.findOneByIso(person.getCountryCode());
			person.setCountry(country);
			person.setTimezone(TimeZone.getDefault());
			person.setDateCreated(LocalDateTime.now());

			return personRepo.save(person);
		} catch (Exception e) {
			log.info(e.getMessage());
			return person;
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Person updatePerson(@RequestBody Person person) {
		try {
			Country country = countryRepo.findOneByIso(person.getCountryCode());
			person.setCountry(country);
			person.setModificationDate(LocalDateTime.now());
			return personRepo.save(person);
		} catch (Exception e) {
			log.info(e.getMessage());
			return person;
		}
	}

	/**
	 * We only deactivate people, not delete them. This is to create an audit trail
	 * for archive
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/deactivate", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Person deactivatePerson(@RequestBody Person person) {
		try {
			Country country = countryRepo.findOneByIso(person.getCountryCode());
			person.setCountry(country);
			person.setModificationDate(LocalDateTime.now());
			person.setActive(false);
			return personRepo.save(person);
		} catch (Exception e) {
			log.info(e.getMessage());
			return person;
		}
	}

	@RequestMapping(value = "/activate", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Person activatePerson(@RequestBody Person person) {
		try {
			Country country = countryRepo.findOneByIso(person.getCountryCode());
			person.setCountry(country);
			person.setModificationDate(LocalDateTime.now());
			person.setActive(true);
			return personRepo.save(person);
		} catch (Exception e) {
			log.info(e.getMessage());
			return person;
		}
	}

	@RequestMapping(value = "/getbyusername", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Person getByUsername(@RequestParam("username") String username) {
		Person person = personRepo.findByUsername(username);
		return person;
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Optional<Person> getById(@PathVariable("id") Long id) {
		Optional<Person> person = personRepo.findById(id);
		return person;
	}

	@RequestMapping(value = "/createrole", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private PersonRole createRole(@RequestBody PersonRole role) {
		Optional<PersonRole> existingrole = rolesRepo.findByRoleName(role.getRoleName());
		if (!existingrole.isPresent()) {
			return rolesRepo.save(role);
		} else {
			PersonRole oldrole = existingrole.get();
			role.setId(oldrole.getId());
			return rolesRepo.save(role);
		}
	}

	@RequestMapping(value = "/setuproles", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private String createBaseRoles() throws URISyntaxException, IOException {
		// parse the csv file
		csvReader.readRolesCsv();
		return "Import of roles complete";
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<Person> getAll() {
		Iterable<Person> person = personRepo.findAll();
		return person;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException, URISyntaxException {
		log.info("uploading file: " + file.getOriginalFilename());
		if (!file.isEmpty()) {
			if (file.getContentType().equals("text/csv")
					&& FilenameUtils.getExtension(file.getOriginalFilename()).toLowerCase().equals("csv")) {
				storageService.store(file);
				// send this off for processing now...
				csvReader.importPeople(file);
				return "You successfully uploaded " + file.getOriginalFilename() + "!";
			} else {
				return "File: " + file.getOriginalFilename() + " does not seem to be a valid CSV file";
			}
		} else {
			return "You failed to upload " + file.getOriginalFilename() + " because the file was empty.";
		}
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

	@RequestMapping(value = "/generatedemopeople", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void generateDemoUsers() {
		// enterprise management
		for (int i = 0; i < 10; i++) {
			personMaker("manager" + i, "manager" + i, "IE", Role.BUSINESS_OWNER);
		}
		// developers
		for (int i = 0; i < 50; i++) {
			personMaker("dev" + i, "dev" + i, "IE", Role.DEVELOPER);
		}
		// scrum masters
		for (int i = 0; i < 10; i++) {
			personMaker("sm" + i, "sm" + i, "IE", Role.SCRUM_MASTER);
		}
		personMaker("rte1", "rte1", "IE", Role.RTE);
		personMaker("ste1", "ste1", "IE", Role.STE);

	}

	private Person personMaker(String username, String name, String countryCode, Role role) {
		Person person = new Person();
		person.setActive(true);
		person.setCountryCode("IE");
		person.setName("rte1");
		person.setUsername("rte1");
		Set<PersonRole> roles = new HashSet<>();
		PersonRole prole = new PersonRole();
		prole.setRole(Role.RTE);
		roles.add(prole);
		person.setRoles(roles);
		return personRepo.save(person);
	}

}