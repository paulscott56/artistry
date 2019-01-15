package artistry.controllers;

import java.time.LocalDateTime;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.geonames.Country;
import artistry.models.person.Person;
import artistry.repositories.CountryRepository;
import artistry.repositories.PersonRepository;

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

	@RequestMapping(value = "/newperson", method = RequestMethod.POST)
	@ResponseBody
	private Person createPerson(@RequestBody Person person) {
		try {
			Country country = countryRepo.findOneByIso(person.getCountryCode());
			person.setCountry(country);
			person.setTimezone(TimeZone.getDefault());
			person.setDateCreated(LocalDateTime.now());

			return personRepo.save(person);
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
			return person;
		}
	}

}
