package artistry.controllers;

import artistry.models.Company;
import artistry.models.ImplementationTeam;
import artistry.models.PersonTeamObject;
import artistry.repositories.CompanyRepository;
import artistry.repositories.ImplementationTeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Configuration
@RestController
@Description("Controller to for handling implementation teams")
@RequestMapping("/team")
class ImplementationTeamRestController {

	static final Logger log = LoggerFactory.getLogger(ImplementationTeamRestController.class);
	
	@Autowired
	private ImplementationTeamRepository teamRepo;
	
	@Autowired
	private CompanyRepository companyRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<ImplementationTeam> getAll() {
		 return teamRepo.findAll();
	}
	
	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Optional<ImplementationTeam> getByName(@PathVariable("name") String name) {
		return teamRepo.findByTeamName(name);
	}
	
	@RequestMapping(value = "/updatescrummaster", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private ImplementationTeam updateScrumMaster(@RequestBody PersonTeamObject personteam) {
		
		 return null;
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Optional<ImplementationTeam> getById(@PathVariable("id") Long id) {
		return teamRepo.findById(id);
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private ImplementationTeam createTeam(@RequestBody ImplementationTeam team) {
		ImplementationTeam savedteam = teamRepo.save(team);
		// we need to also update the company links
		Company c = team.getCompany();
		Optional<Company> coCheck = companyRepo.findById(c.getId());
		if (coCheck.isPresent()) {
			Company cotoupdate = coCheck.get();
			Set<ImplementationTeam> teamlist = cotoupdate.getTeams();
			if (teamlist != null && teamlist.size() > 0) {
				teamlist.add(savedteam);
				cotoupdate.setTeams(teamlist);
			} else {
				Set<ImplementationTeam> newteamlist = new HashSet<>();
				newteamlist.add(savedteam);
				cotoupdate.setTeams(newteamlist);
			}
			companyRepo.save(cotoupdate);
		}
		return savedteam;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteLargeSolution(@PathVariable("id") Long id) {
		Optional<ImplementationTeam> team = teamRepo.findById(id);
		team.ifPresent(implementationTeam -> teamRepo.delete(implementationTeam));
	}
}
