package artistry.controllers;

import artistry.enums.DocumentStatus;
import artistry.enums.EpicType;
import artistry.enums.License;
import artistry.enums.Role;
import artistry.models.*;
import artistry.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@Configuration
@RestController
@Description("Controller to set up a demo")
@RequestMapping("/demo")
class DemoSetupController {

	static final Logger log = LoggerFactory.getLogger(DemoSetupController.class);

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

	@Autowired
	private LargeSolutionRepository largeSolutionRepo;

	@Autowired
	private ProgramRepository programRepo;

	@Autowired
	private PrincipalRoleRepository principalRoleRepo;

	@Autowired
	private CapabilityRepository capRepo;

	@Autowired
	private TrainRepository trainRepo;

	@RequestMapping(value = "/generatedemo", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public void generateDemo() {
		try {
			createEnterprise();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void createEnterprise() throws MalformedURLException {
		Enterprise e = new Enterprise();
		e.setEnterpriseName("Demo");

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
		enablerEpics.add(epicMaker());
		p.setEnablerEpics(enablerEpics);

		Set<Epic> businessEpics = new HashSet<>();
		p.setBusinessEpics(businessEpics);

		p.setEnterpriseArchitect(personMaker("eaperson", "Justin", "US", Role.ENTERPRISE_ARCHITECT, true));

		// we want to create a large solution now

		Set<LargeSolution> largeSolutions = new HashSet<>();
		largeSolutions.add(largeSolutionMaker());
		p.setLargeSolutions(largeSolutions);
		return portfolioRepo.save(p);
	}

	private LargeSolution largeSolutionMaker() {
		LargeSolution ls = new LargeSolution();
		ls.setCustomer(personMaker("cust1", "customer", "IE", Role.CUSTOMER, false));

		Set<Capability> caps = new HashSet<>();
		caps.add(capabilityMaker());
		ls.setCapabilities(caps);

		ls.setInspectAndAdaptEvent(inspectAndAdaptEventMaker());
		ls.setLargeSolutionName("demo large solution");

		Set<NonFunctionalRequirement> nfrset = new HashSet<>();
		nfrset.add(nfrMaker());
		ls.setNonFunctionalRequirements(nfrset);

		Set<Document> ppdocs = new HashSet<>();
		ppdocs.add(docMaker("post planning thing", "Post planning"));
		ls.setPostPlanningDocuments(ppdocs);

		Set<Document> predocs = new HashSet<>();
		predocs.add(docMaker("pre planning thing", "Pre planning"));
		ls.setPrePlanningDocuments(predocs);

		Set<Program> progs = new HashSet<>();
		progs.add(programMaker());
		ls.setPrograms(progs);

		ls.setSolutionArchitect(personMaker("sarch", "Seamus", "US", Role.SOLUTION_ARCHITECT, false));
		ls.setSolutionBacklog(solutionBacklogMaker());

		ls.setSolutionContext(docMaker("solution context", "sl context"));
		ls.setSolutionDemo(new Date());

		Set<Epic> se = new HashSet<>();
		se.add(epicMaker());
		se.add(epicMaker());
		ls.setSolutionEpics(se);

		ls.setSolutionIntent(docMaker("solution intent", "intent"));
		Set<Person> solman = new HashSet<>();
		solman.add(personMaker("solman1", "solution manager", "US", Role.SOLUTION_MANAGER, false));
		ls.setSolutionManagement(solman);
		ls.setSolutionTrainEngineer(personMaker("steperson", "Steve", "US", Role.STE, false));

		Set<Train> trains = new HashSet<>();
		trains.add(trainMaker("train 1"));
		ls.setTrains(trains);

		return largeSolutionRepo.save(ls);
	}

	private Train trainMaker(String name) {
		Train t = new Train();
		t.setName(name);

		Set<ImplementationTeam> teams = new HashSet<>();
		t.setPeopleAndLocations(teams);

		Set<ProgramIncrement> pis = new HashSet<>();
		t.setPi(pis);

		t.setSolutionStatement(docMaker("Solution statement body", "sol statement"));
		t.setTeamDesignStrategy(docMaker("Team strategy 1", "Strategy"));
		t.setVisionStatement(docMaker("Our vision", "to do stuff"));

		return trainRepo.save(t);
	}

	private Program programMaker() {
		Program p = new Program();

		Set<Document> ardocs = new HashSet<>();
		ardocs.add(docMaker("Architectural runway doc 1", "Architectural runway"));
		p.setArchitecturalRunway(ardocs);

		Set<Person> bos = new HashSet<>();
		bos.add(personMaker("bo1", "denis", "US", Role.BUSINESS_OWNER, false));
		bos.add(personMaker("bo2", "froy", "NO", Role.BUSINESS_OWNER, false));
		p.setBusinessOwners(bos);

		Set<InspectAndAdapt> ia = new HashSet<>();
		ia.add(inspectAndAdaptEventMaker());
		p.setInspectAndAdaptWorkshops(ia);

		Set<Person> cust = new HashSet<>();
		cust.add(personMaker("pcln", "priceline", "US", Role.CUSTOMER, false));
		p.setKeyCustomers(cust);

		Set<Person> stake = new HashSet<>();
		p.setOtherStakeholders(stake);

		Set<PrincipalRole> principalRoles = new HashSet<>();
		principalRoles.add(principalRoleMaker());
		p.setPrincipalRoles(principalRoles);

		Set<Person> pm = new HashSet<>();
		p.setProductManagement(pm);

		ProgramBacklog pb = new ProgramBacklog();
		p.setProgramBacklog(pb);

		Set<Epic> pe = new HashSet<>();
		p.setProgramEpics(pe);

		ProgramKanban pk = new ProgramKanban();
		p.setProgramKanban(pk);

		p.setProgramName("HCCD");

		p.setReleaseTrainEngineer(personMaker("rte1", "Rte 1", "US", Role.RTE, false));

		Set<String> successmeasures = new HashSet<>();
		successmeasures.add("we get something done");
		p.setSuccessMeasures(successmeasures);

		p.setSystemArchitect(personMaker("ste1", "Ste ve", "US", Role.STE, false));

		Set<SystemDemo> sd = new HashSet<>();
		p.setSystemDemo(sd);

		p.setTrain(trainMaker("train 2"));

		ValueStream vs = new ValueStream();
		p.setValueStream(vs);

		return programRepo.save(p);
	}

	private PrincipalRole principalRoleMaker() {
		PrincipalRole p = new PrincipalRole();
		p.setDescription("A person that looks after a product");
		p.setRole(Role.PRODUCT_MANAGER);
		p.setPerson(personMaker("pm2", "PM 2", "US", Role.PRODUCT_MANAGER, false));
		return principalRoleRepo.save(p);
	}

	private InspectAndAdapt inspectAndAdaptEventMaker() {
		InspectAndAdapt ia = new InspectAndAdapt();
		return ia;
	}

	private Capability capabilityMaker() {
		Capability c = new Capability();
		c.setAccepted(true);
		c.setCapabilityName("Capability 1");
		c.setBenefitHypothesis(docMaker("benefit hypothesis 1", "ben 1"));
		c.setSolutionBacklog(solutionBacklogMaker());
		return capRepo.save(c);
	}

	private SolutionBacklog solutionBacklogMaker() {
		SolutionBacklog s = new SolutionBacklog();
		return s;
	}

	private Epic epicMaker() {
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

		e.setEpicDescription("epic 1");
		e.setEpicName("epic 1");

		e.setEpicOwner(personMaker("epicOwner", "epicOwner", "IE", Role.EPIC_OWNER, false));
		e.setEpicType(EpicType.PORTFOLIO_EPIC_SPLIT_INTO_PROGRAM_EPICS_AND_DECENTRALIZE);
		e.setEstimatedMonetaryCost(new BigDecimal("56"));
		e.setEstimatedStoryPoints(103);

		DevelopmentTimeLine estimatedTimeline = new DevelopmentTimeLine();
		estimatedTimeline.setEstimatedCompletionDate(new Date());
		estimatedTimeline.setEstimatedStartDate(new Date());
		e.setEstimatedTimeline(estimatedTimeline);

		e.setFunnelEntryDate(new Date());
		e.setGoNoGo(true);
		e.setHypothesisStatement("We will build it, they will come");

		e.setImpactOnProductsAndServices(docMaker("impactOnProductsAndServices", "impactOnProductsAndServices"));
		e.setImpactOnSalesDeployment(docMaker("ImpactOnSalesDeployment", "ImpactOnSalesDeployment"));
		e.setIncrementalImplementationStrategy(EpicType.PROGRAM_EPIC_SPIKE_FIRST);
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
		Map<String, String> keyValuePairs = new HashMap<>();
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
		return featureRepo.save(f);
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
		co.setCountry(countryMaker());
		// co.setTeams(teams);
		return coRepo.save(co);
	}

	private Country countryMaker() {
		return countryRepo.findOneByIso("IE");
	}

	private Person personMaker(String username, String name, String countryCode, Role role, boolean agileTeamMember) {
		Person person = new Person();
		person.setActive(true);
		person.setCountryCode(countryCode);
		person.setName(name);
		person.setUsername(username);
		Set<PersonRole> roles = new HashSet<>();
		Optional<PersonRole> prole = rolesRepo.findByRole(role);
		if (prole.isPresent()) {
			roles.add(prole.get());
			if (agileTeamMember) {
				Optional<PersonRole> agileteammem = rolesRepo.findByRole(Role.AGILE_TEAM_MEMBER);
				agileteammem.ifPresent(roles::add);
			}
			person.setRoles(roles);
			return personRepo.save(person);
		} else {
			PersonRole pr = new PersonRole();
			pr.setRole(role);
			rolesRepo.save(pr);
			person.setRoles(roles);

			return personRepo.save(person);
		}
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
