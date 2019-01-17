package artistry.controllers;

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

import artistry.models.dto.PersonTeamObject;
import artistry.models.person.ImplementationTeam;
import artistry.models.person.Person;
import artistry.repositories.ImplementationTeamRepository;

@Configuration
@RestController
@Description("Controller to for handling implementation teams")
@RequestMapping("/team")
public class TeamRestController {

	static final Logger log = LoggerFactory.getLogger(TeamRestController.class);
	
	@Autowired
	private ImplementationTeamRepository teamRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<ImplementationTeam> getAll() {
		 return teamRepo.findAll();
	}
	
	@RequestMapping(value = "/updatescrummaster", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private ImplementationTeam updateScrumMaster(@RequestBody PersonTeamObject personteam) {
		
		 return null;
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Optional<ImplementationTeam> getById(@PathVariable("id") Long id) {
		Optional<ImplementationTeam> team = teamRepo.findById(id);
		return team;
	}
	
}
