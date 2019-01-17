package artistry.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import artistry.enums.Role;
import artistry.models.dto.PersonTeamObject;
import artistry.models.person.Company;
import artistry.models.person.ImplementationTeam;
import artistry.models.person.Person;
import artistry.models.train.Enterprise;
import artistry.repositories.CompanyRepository;
import artistry.repositories.EnterpriseRepository;
import artistry.repositories.ImplementationTeamRepository;
import artistry.repositories.PersonRepository;

@Configuration
@RestController
@Description("Controller to set up and maintain the various levels of organization")
@RequestMapping("/org")
public class OrganizationController {

	static final Logger log = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	private EnterpriseRepository enterpriseRepo;

	@Autowired
	private CompanyRepository companyRepo;

	@Autowired
	private ImplementationTeamRepository teamRepo;

	@Autowired
	private PersonRepository personRepo;

	@RequestMapping(value = "/newenterprise", method = RequestMethod.POST)
	@ResponseBody
	private Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
		Enterprise savedenterprise = enterpriseRepo.save(enterprise);
		return savedenterprise;
	}

	@RequestMapping(value = "/newcompany", method = RequestMethod.POST)
	@ResponseBody
	private Company createCompany(@RequestBody Company company) {
		Company savedcompany = companyRepo.save(company);
		return savedcompany;
	}

	@RequestMapping(value = "/newteam", method = RequestMethod.POST)
	@ResponseBody
	private ImplementationTeam createTeam(@RequestBody ImplementationTeam team) {
		ImplementationTeam savedteam = teamRepo.save(team);
		// we need to also update the company links
		Company c = team.getCompany();
		Optional<Company> coCheck = companyRepo.findById(c.getId());
		if (coCheck.isPresent()) {
			Company cotoupdate = coCheck.get();
			List<ImplementationTeam> teamlist = cotoupdate.getTeams();
			if (teamlist != null && teamlist.size() > 0) {
				teamlist.add(savedteam);
				cotoupdate.setTeams(teamlist);
			} else {
				List<ImplementationTeam> newteamlist = new ArrayList<>();
				newteamlist.add(savedteam);
				cotoupdate.setTeams(newteamlist);
			}
			companyRepo.save(cotoupdate);
		}
		return savedteam;
	}

	@RequestMapping(value = "/addpersontoteam", method = RequestMethod.POST)
	@ResponseBody
	private ImplementationTeam addPersonToTeam(@RequestBody PersonTeamObject personteam) {
		Optional<Person> optperson = personRepo.findById(personteam.getPersonId());
		Optional<ImplementationTeam> optteam = teamRepo.findById(personteam.getImplementationTeamId());
		if (optperson.isPresent() && optteam.isPresent()) {
			ImplementationTeam team = optteam.get();
			Person person = optperson.get();
			List<Role> roles = personteam.getRoles();
			// first we add the person as part of the agile team. All people in the team go
			// into this list
			List<Person> agileteam = team.getAgileTeam();
			if (agileteam == null) {
				agileteam = new ArrayList<>();
			}
			if (!agileteam.contains(person)) {
				agileteam.add(person);
				team.setAgileTeam(agileteam);
			}

			// now we see the more specialized roles as to where this person fits in
			// List<PersonRole> personroles = person.getRoles();
			for (Role role : roles) {
				switch (role.toString()) {
				case "SCRUM_MASTER":
					team.setScrumMaster(person);
					break;

				case "DEVELOPER":
					List<Person> devlist = team.getDevTeam();
					if (devlist == null) {
						devlist = new ArrayList<>();
					}
					if (!devlist.contains(person)) {
						devlist.add(person);
						team.setDevTeam(devlist);
					}
					break;

				case "PRODUCT_OWNER":
					team.setProductOwner(person);
					break;
				}
			}
			return teamRepo.save(team);
		}
		return null;
	}

}