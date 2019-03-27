/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.repositories.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = DemoSetupController.class)
public class DemoSetupControllerTest {

	@Autowired
	private DemoSetupController underTest;

	@MockBean
	private CapabilityRepository capRepo;

	@MockBean
	private CompanyRepository coRepo;

	@MockBean
	private CountryRepository countryRepo;

	@MockBean
	private DocumentRepository docRepo;

	@MockBean
	private DevelopmentValueStreamRepository dsRepo;

	@MockBean
	private EnterpriseRepository enterpriseRepo;

	@MockBean
	private EpicRepository epicRepo;

	@MockBean
	private FeatureRepository featureRepo;

	@MockBean
	private InspectAndAdaptRepository iaRepo;

	@MockBean
	private KpiRepository kpiRepo;

	@MockBean
	private LargeSolutionRepository largeSolutionRepo;

	@MockBean
	private NonFunctionalRequirementRepository nfrRepo;

	@MockBean
	private OperationalValueStreamRepository opRepo;

	@MockBean
	private ProgramBacklogRepository pbRepo;

	@MockBean
	private PersonRepository personRepo;

	@MockBean
	private ProgramKanbanRepository pkRepo;

	@MockBean
	private PortfolioRepository portfolioRepo;

	@MockBean
	private PrincipalRoleRepository principalRoleRepo;

	@MockBean
	private ProgramRepository programRepo;

	@MockBean
	private RequirementRepository requirementRepo;

	@MockBean
	private RolesRepository rolesRepo;

	@MockBean
	private SystemDemoRepository sdRepo;

	@MockBean
	private SolutionBacklogRepository solutionBacklogRepo;

	@MockBean
	private ImplementationTeamRepository teamRepo;

	@MockBean
	private TrainRepository trainRepo;

	@MockBean
	private ValueStreamRepository vsRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testGenerateDemo_MVC_get() throws Exception {
		// given
		// when
		mockMvc.perform(get("/demo/generatedemo")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGenerateDemo() throws Exception {
		// given
		// when
		underTest.generateDemo();
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

}