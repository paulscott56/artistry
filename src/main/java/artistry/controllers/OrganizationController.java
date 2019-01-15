package artistry.controllers;

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

import artistry.models.person.Company;
import artistry.models.person.ImplementationTeam;
import artistry.models.train.Enterprise;
import artistry.repositories.CompanyRepository;
import artistry.repositories.EnterpriseRepository;
import artistry.repositories.ImplementationTeamRepository;

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
		return savedteam;
	}

}
