/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmailAddressTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private EmailAddress underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetEmergencyContactEmail() throws Exception {
		// given
		String value = "emergencyContactEmail";
		underTest.setEmergencyContactEmail(value);
		// when
		String actual = underTest.getEmergencyContactEmail();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetId() throws Exception {
		// given
		Long value = 0L;
		underTest.setId(value);
		// when
		Long actual = underTest.getId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPersonalEmail() throws Exception {
		// given
		String value = "personalEmail";
		underTest.setPersonalEmail(value);
		// when
		String actual = underTest.getPersonalEmail();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSupportEmail() throws Exception {
		// given
		String value = "supportEmail";
		underTest.setSupportEmail(value);
		// when
		String actual = underTest.getSupportEmail();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTeamEmail() throws Exception {
		// given
		String value = "teamEmail";
		underTest.setTeamEmail(value);
		// when
		String actual = underTest.getTeamEmail();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWorkEmail() throws Exception {
		// given
		String value = "workEmail";
		underTest.setWorkEmail(value);
		// when
		String actual = underTest.getWorkEmail();
		// then
		assertEquals(value, actual);
	}

}
