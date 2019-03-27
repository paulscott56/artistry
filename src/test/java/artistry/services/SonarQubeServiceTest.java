/** This class was generated by GenTest@Mobacar */
package artistry.services;

import artistry.models.SonarQubeCoverageReport;
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
@ContextConfiguration(classes = SonarQubeService.class)
public class SonarQubeServiceTest {

	@Autowired
	private SonarQubeService underTest;

	@Value("${sonarqube.url}")
	private String sonarqubeUrl;

	@MockBean
	private RestTemplate rt;

	@Before
	public void setupTest() {
		// prepare test
	}

	@Test
	public void testGetCoverage() throws Exception {
		// given
		String artifact = "artifact";
		// when
		SonarQubeCoverageReport actual = underTest.getCoverage(artifact);
		// then
		assertNotNull(actual);
	}

}