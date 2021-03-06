/** This class was generated by GenTest@Mobacar */
package artistry.configuration;

import artistry.utils.StorageService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = StorageProperties.class)
public class StoragePropertiesTest {

	@Autowired
	private StorageProperties underTest;
	

	@Value("${artistry.data.directory}")
	private String location;

	@Before
	public void setupTest() {
		// prepare test
	}

	@Test
	public void testInit() throws Exception {
		// given
		StorageService storageService = mock(StorageService.class);
		// when
		CommandLineRunner actual = underTest.init(storageService);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testSetLocation() throws Exception {
		// given
		String location = "location";
		// when
		underTest.setLocation(location);
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGetLocation() throws Exception {
		// given
		// when
		String actual = StorageProperties.getLocation();
		// then
		assertEquals("", actual);
	}

}
