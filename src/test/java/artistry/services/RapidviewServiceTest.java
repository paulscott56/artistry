/** This class was generated by GenTest@Mobacar */
package artistry.services;

import artistry.models.RapidView;
import artistry.models.RapidviewEntry;
import artistry.repositories.RapidviewRepository;
import artistry.utils.JiraUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = RapidviewService.class)
public class RapidviewServiceTest {

	@Autowired
	private RapidviewService underTest;

	@Value("${jira.url}")
	private String jiraUrl;

	@MockBean
	private RapidviewRepository repo;

	@MockBean
	private RestTemplate rt;

	@MockBean
	private JiraUtils utils;

	@Before
	public void setupTest() {
		// prepare test
	}

	@Test
	public void testGetRapidViews() throws Exception {
		// given
		// when
		RapidView actual = underTest.getRapidViews();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetViewById() throws Exception {
		// given
		String id = "id";
		// when
		RapidviewEntry actual = underTest.getViewById(id);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testSaveViews() throws Exception {
		// given
		RapidView views = new RapidView();
		// when
		underTest.saveViews(views);
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

}
