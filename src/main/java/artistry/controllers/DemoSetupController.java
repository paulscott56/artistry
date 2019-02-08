package artistry.controllers;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import artistry.enums.DocumentStatus;
import artistry.enums.EpicType;
import artistry.enums.License;
import artistry.enums.Role;
import artistry.models.Company;
import artistry.models.Country;
import artistry.models.DevelopmentTimeLine;
import artistry.models.Document;
import artistry.models.Enterprise;
import artistry.models.Epic;
import artistry.models.Feature;
import artistry.models.GuardRails;
import artistry.models.ImplementationTeam;
import artistry.models.KPI;
import artistry.models.NonFunctionalRequirement;
import artistry.models.Person;
import artistry.models.PersonRole;
import artistry.models.Portfolio;
import artistry.models.PortfolioBudget;
import artistry.models.Requirement;
import artistry.repositories.CompanyRepository;
import artistry.repositories.CountryRepository;
import artistry.repositories.DocumentRepository;
import artistry.repositories.EpicRepository;
import artistry.repositories.FeatureRepository;
import artistry.repositories.ImplementationTeamRepository;
import artistry.repositories.KpiRepository;
import artistry.repositories.NonFunctionalRequirementRepository;
import artistry.repositories.PersonRepository;
import artistry.repositories.PortfolioRepository;
import artistry.repositories.RequirementRepository;
import artistry.repositories.RolesRepository;

public class DemoSetupController {

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private RolesRepository rolesRepo;

	@Autowired
	private DocumentRepository docRepo;

	@Autowired
	private KpiRepository kpiRepo;

	@Autowired
	private PortfolioRepository portfolioRepo;

	@Autowired
	private EpicRepository epicRepo;

	@Autowired
	private ImplementationTeamRepository teamRepo;

	@Autowired
	private FeatureRepository featureRepo;

	@Autowired
	private RequirementRepository requirementRepo;

	@Autowired
	private NonFunctionalRequirementRepository nfrRepo;

	@Autowired
	private CompanyRepository coRepo;

	@RequestMapping(value = "/generatedemo", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void generateDemo() {
		// createEnterprise();
		// createCompanies();
		// createPortfolio();
		// createLargeSolutions();
		// createPrograms();
		// createTeams();

	}

	private void createEnterprise() throws MalformedURLException {
		Enterprise e = new Enterprise();
		e.setEnterpriseName("Travelport");

		GuardRails gr = new GuardRails();
		gr.setLowerLimit(new BigDecimal("-10000"));
		gr.setUpperLimit(new BigDecimal("100000"));
		e.setGuardRails(gr);

		Set<Person> keyPersonnel = new HashSet<>();
		keyPersonnel.add(personMaker("ctoperson", "John", "US", Role.CTO, false));
		keyPersonnel.add(personMaker("ceoperson", "Jack", "US", Role.CEO, false));
		keyPersonnel.add(personMaker("cfoperson", "Lucy", "US", Role.BUSINESS_OWNER, false));
		e.setKeyPersonnel(keyPersonnel);

		Set<KPI> kpis = new HashSet<>();
		kpis.add(kpiMaker("kpi 1"));
		kpis.add(kpiMaker("kpi 2"));
		kpis.add(kpiMaker("kpi 3"));
		e.setKpis(kpis);

		PortfolioBudget pb = new PortfolioBudget();
		Set<URL> budgetLinks = new HashSet<>();
		budgetLinks.add(new URL("http://accounts/budget1"));
		budgetLinks.add(new URL("http://accounts/budget2"));
		pb.setBudgetLinks(budgetLinks);

		Set<Document> supportingDocumentation = new HashSet<>();
		supportingDocumentation.add(docMaker("supporting budget doc", "budget 2019 OPEX"));
		supportingDocumentation.add(docMaker("supporting budget doc2", "budget 2019 CAPEX"));
		pb.setSupportingDocumentation(supportingDocumentation);
		e.setPortfolioBudget(pb);

		Set<Portfolio> portfolios = new HashSet<>();
		portfolios.add(portfolioMaker());
		e.setPortfolios(portfolios);

	}

	private Portfolio portfolioMaker() {
		Portfolio p = new Portfolio();

		Set<Epic> enablerEpics = new HashSet<>();
		enablerEpics
				.add(epicMaker("epic 1", "epic 1", EpicType.PORTFOLIO_EPIC_SPLIT_INTO_PROGRAM_EPICS_AND_DECENTRALIZE,
						103, "We will build it, they will come", EpicType.PROGRAM_EPIC_SPIKE_FIRST));
		p.setEnablerEpics(enablerEpics);

		Set<Epic> businessEpics = new HashSet<>();
		p.setBusinessEpics(businessEpics);

		p.setEnterpriseArchitect(personMaker("eaperson", "Justin", "US", Role.ENTERPRISE_ARCHITECT, true));
		return portfolioRepo.save(p);
	}

	private Epic epicMaker(String epicDescription, String epicName, EpicType epicType, int estimatedStoryPoints,
			String hypothesisStatement, EpicType incrementalImplementationStrategy) {
		Epic e = new Epic();

		Set<Feature> additionalPotentialFeatures = new HashSet<>();
		additionalPotentialFeatures.add(featureMaker("to make money", 3, "feature 56"));
		e.setAdditionalPotentialFeatures(additionalPotentialFeatures);
		e.setAnalysisSummary(docMaker("analysisSummary", "analysisSummary"));
		e.setAnticipatedBusinessImpact(docMaker("anticipatedBusinessImpact", "anticipatedBusinessImpact"));

		Set<Document> attachments = new HashSet<>();
		attachments.add(docMaker("attachment 1", "attachment1"));
		e.setAttachments(attachments);

		e.setBusinessOutcomeHypothesis(docMaker("businessOutcomeHypothesis", "businessOutcomeHypothesis"));
		Set<Person> customers = new HashSet<>();
		customers.add(personMaker("cust1", "customer1", "IN", Role.CUSTOMER, false));
		e.setCustomers(customers);
		e.setEpicDescription(epicDescription);
		e.setEpicName(epicName);

		e.setEpicOwner(personMaker("epicOwner", "epicOwner", "IE", Role.EPIC_OWNER, false));
		e.setEpicType(epicType);
		e.setEstimatedMonetaryCost(new BigDecimal("56"));
		e.setEstimatedStoryPoints(estimatedStoryPoints);
		DevelopmentTimeLine estimatedTimeline = new DevelopmentTimeLine();
		estimatedTimeline.setEstimatedCompletionDate(new Date());
		estimatedTimeline.setEstimatedStartDate(new Date());
		e.setEstimatedTimeline(estimatedTimeline);
		e.setFunnelEntryDate(new Date());
		e.setGoNoGo(true);
		e.setHypothesisStatement(hypothesisStatement);

		e.setImpactOnProductsAndServices(docMaker("impactOnProductsAndServices", "impactOnProductsAndServices"));
		e.setImpactOnSalesDeployment(docMaker("ImpactOnSalesDeployment", "ImpactOnSalesDeployment"));
		e.setIncrementalImplementationStrategy(incrementalImplementationStrategy);
		e.setInhouseOrExternalDev(docMaker("inhouseOrExternalDev", "inhouseOrExternalDev"));

		Set<Requirement> inScope = new HashSet<>();
		inScope.add(requirementMaker());
		e.setInScope(inScope);

		e.setLeadingIndicators(docMaker("leadingIndicators", "leadingIndicators"));
		e.setMilestones(docMaker("milestones", "milestones"));
		Set<Feature> mvpFeatures = new HashSet<>();
		mvpFeatures.add(featureMaker("benefit3", 6, "feature3"));
		mvpFeatures.add(featureMaker("benefit7", 4, "feature7"));
		e.setMvpFeatures(mvpFeatures);

		Set<NonFunctionalRequirement> nonFunctionalRequirements = new HashSet<>();
		nonFunctionalRequirements.add(nfrMaker());
		e.setNonFunctionalRequirements(nonFunctionalRequirements);

		e.setNotesAndComments(docMaker("notesAndComments", "notesAndComments"));

		Set<Requirement> outOfScope = new HashSet<>();
		outOfScope.add(requirementMaker());
		e.setOutOfScope(outOfScope);

		e.setSequencingAndDependencies(docMaker("sequencingAndDependencies", "sequencingAndDependencies"));
		Set<Person> sponsors = new HashSet<>();
		sponsors.add(personMaker("spons1", "Dan", "US", Role.SUPPLIER, false));
		sponsors.add(personMaker("spons2", "Denis", "IE", Role.CUSTOMER, false));
		e.setSponsors(sponsors);

		e.setTypeOfReturn(docMaker("typeOfReturn", "typeOfReturn"));
		Set<String> usersAndMarketsAffecred = new HashSet<>();
		usersAndMarketsAffecred.add("Priceline");
		usersAndMarketsAffecred.add("LATAM");
		e.setUsersAndMarketsAffecred(usersAndMarketsAffecred);

		return epicRepo.save(e);
	}

	private NonFunctionalRequirement nfrMaker() {
		NonFunctionalRequirement nfr = new NonFunctionalRequirement();
		HashMap<String, String> keyValuePairs = new HashMap<>();
		keyValuePairs.put("Testing", "test plan to be included for 3 story points");
		nfr.setKeyValuePairs(keyValuePairs);
		return nfrRepo.save(nfr);
	}

	private Requirement requirementMaker() {
		Requirement r = new Requirement();

		return requirementRepo.save(r);
	}

	private Feature featureMaker(String benefitStatement, int businessValue, String featureName) {
		Feature f = new Feature();
		Set<Document> acceptanceCriteria = new HashSet<>();
		f.setAcceptanceCriteria(acceptanceCriteria);

		Set<String> additionalNotes = new HashSet<>();
		additionalNotes.add("note 1");
		additionalNotes.add("note 2");
		f.setAdditionalNotes(additionalNotes);

		f.setAssumptions(docMaker("assumption 1", "feature assumptions"));

		f.setBenefitStatement(benefitStatement);
		f.setBusinessValue(businessValue);
		f.setComplete(false);
		f.setCreatedBy(personMaker("featurewriter", "Luke", "IE", Role.PRODUCT_OWNER, true));
		f.setCreationDate(new Date());

		f.setDefinitionOfDone(docMaker("def of done", "definition of done"));

		f.setFeatureDescription(docMaker("featureDescription", "feature 1"));
		f.setFeatureName(featureName);
		f.setFeatureOwner(personMaker("featurewriter", "Patrick", "IE", Role.PRODUCT_MANAGER, false));
		f.setFeatureOwnerTeam(teamMaker());
		return null;
	}

	private ImplementationTeam teamMaker() {
		ImplementationTeam team = new ImplementationTeam();
		Set<Person> agileTeam = new HashSet<>();
		team.setAgileTeam(agileTeam);
		Set<Person> devTeam = new HashSet<>();
		devTeam.add(personMaker("dev1", "dev1", "IE", Role.DEVELOPER, true));
		devTeam.add(personMaker("dev2", "dev2", "IE", Role.DEVELOPER, true));
		devTeam.add(personMaker("dev3", "dev3", "IE", Role.DEVELOPER, true));
		devTeam.add(personMaker("sm1", "sm1", "IE", Role.SCRUM_MASTER, true));
		devTeam.add(personMaker("test1", "test1", "IE", Role.TESTER, true));
		team.setDevTeam(devTeam);

		// team.setCompany(companyMaker("Mobacar"));
		// team.setInnovationAndPlanningDocuments(innovationAndPlanningDocuments);
		// team.setIterationPlanningDocuments(iterationPlanningDocuments);
		// team.setIterationRetrospectives(iterationRetrospectives);
		// team.setIterationReviews(iterationReviews);
		// team.setProductOwner(productOwner);
		// team.setScrumMaster(scrumMaster);
		// team.setTeamEmail(teamEmail);
		// team.setTeamLogo(new URL("https://placekitten.com/200/300"));
		// team.setTeamName(teamName);

		return teamRepo.save(team);
	}

	private Company companyMaker(String companyName) {
		Company co = new Company();
		co.setCompanyName(companyName);
		co.setContactPerson(personMaker("contact1", "contact1", "IE", Role.CEO, false));
		co.setCountry(countryMaker("IE"));
		// co.setTeams(teams);
		return coRepo.save(co);
	}

	private Country countryMaker(String countryCode) {
		return countryRepo.findOneByIso(countryCode);
	}

	private Person personMaker(String username, String name, String countryCode, Role role, boolean agileTeamMember) {
		Person person = new Person();
		person.setActive(true);
		person.setCountryCode(countryCode);
		person.setName(name);
		person.setUsername(username);
		Set<PersonRole> roles = new HashSet<>();
		Optional<PersonRole> prole = rolesRepo.findByRole(role);
		roles.add(prole.get());
		if (agileTeamMember) {
			Optional<PersonRole> agileteammem = rolesRepo.findByRole(Role.AGILE_TEAM_MEMBER);
			roles.add(agileteammem.get());
		}
		person.setRoles(roles);
		return personRepo.save(person);
	}

	private KPI kpiMaker(String objective) {
		KPI kpi = new KPI();
		kpi.setActive(true);

		Set<Document> attachedDocumentation = new HashSet<>();
		kpi.setAttachedDocumentation(attachedDocumentation);

		kpi.setCreationDate(new Date());
		kpi.setObjective(objective);

		Set<Person> stakeholders = new HashSet<>();
		stakeholders.add(personMaker("sam", "Sam", "US", Role.BUSINESS_OWNER, false));
		stakeholders.add(personMaker("sally", "Sally", "US", Role.BUSINESS_OWNER, false));
		kpi.setStakeholders(stakeholders);

		kpi.setVersion(1);

		Set<Document> reviewdoc = new HashSet<>();
		reviewdoc.add(docMaker("review 1", "review 1"));
		reviewdoc.add(docMaker("review 2", "review 2"));
		kpi.setReview(reviewdoc);

		return kpiRepo.save(kpi);
	}

	private Document docMaker(String documentBody, String title) {
		Document doc = new Document();
		doc.setCreationDate(new Date());
		doc.setLicense(License.CC_BY_SA);
		doc.setDocumentBody(documentBody);
		doc.setPrimaryAuthor(personMaker("doc", "Doc Brown", "IE", Role.PRODUCT_OWNER, true));
		doc.setStatus(DocumentStatus.DRAFT);
		doc.setTitle(title);
		doc.setVersion("v1 - start draft");

		return docRepo.save(doc);
	}

}
