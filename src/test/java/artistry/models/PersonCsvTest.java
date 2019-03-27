/** This class was generated by GenTest@Mobacar */
package artistry.models;

import com.opencsv.bean.CsvBindByPosition;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import utils.*;

@RunWith(MockitoJUnitRunner.class)
public class PersonCsvTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private PersonCsv underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAddress() throws Exception {
		// given
		String value = "address";
		underTest.setAddress(value);
		// when
		String actual = underTest.getAddress();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCountryCode() throws Exception {
		// given
		String value = "countryCode";
		underTest.setCountryCode(value);
		// when
		String actual = underTest.getCountryCode();
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
	public void testGetJiraUsername() throws Exception {
		// given
		String value = "jiraUsername";
		underTest.setJiraUsername(value);
		// when
		String actual = underTest.getJiraUsername();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetMobilePhone() throws Exception {
		// given
		String value = "mobilePhone";
		underTest.setMobilePhone(value);
		// when
		String actual = underTest.getMobilePhone();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetName() throws Exception {
		// given
		String value = "name";
		underTest.setName(value);
		// when
		String actual = underTest.getName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetNickname() throws Exception {
		// given
		String value = "nickname";
		underTest.setNickname(value);
		// when
		String actual = underTest.getNickname();
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
	public void testGetSurname() throws Exception {
		// given
		String value = "surname";
		underTest.setSurname(value);
		// when
		String actual = underTest.getSurname();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetUsername() throws Exception {
		// given
		String value = "username";
		underTest.setUsername(value);
		// when
		String actual = underTest.getUsername();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWorkPhone() throws Exception {
		// given
		String value = "workPhone";
		underTest.setWorkPhone(value);
		// when
		String actual = underTest.getWorkPhone();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWorkemail() throws Exception {
		// given
		String value = "workemail";
		underTest.setWorkemail(value);
		// when
		String actual = underTest.getWorkemail();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsActive() throws Exception {
		// given
		boolean value = false;
		underTest.setActive(value);
		// when
		boolean actual = underTest.isActive();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSerialVersionUID() throws Exception {
		// given
		// when
		long actual = PersonCsv.getSerialVersionUID();
		// then
		assertEquals(0L, actual);
	}

}
