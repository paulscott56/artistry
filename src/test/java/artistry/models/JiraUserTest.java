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
public class JiraUserTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private JiraUser underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAccountId() throws Exception {
		// given
		String value = "accountId";
		underTest.setAccountId(value);
		// when
		String actual = underTest.getAccountId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetApplicationRoles() throws Exception {
		// given
		JiraApplicationRoles value = new JiraApplicationRoles();
		underTest.setApplicationRoles(value);
		// when
		JiraApplicationRoles actual = underTest.getApplicationRoles();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAvatarUrls() throws Exception {
		// given
		AvatarUrls value = new AvatarUrls();
		underTest.setAvatarUrls(value);
		// when
		AvatarUrls actual = underTest.getAvatarUrls();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDisplayName() throws Exception {
		// given
		String value = "displayName";
		underTest.setDisplayName(value);
		// when
		String actual = underTest.getDisplayName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEmailAddress() throws Exception {
		// given
		String value = "emailAddress";
		underTest.setEmailAddress(value);
		// when
		String actual = underTest.getEmailAddress();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetErrorOrComment() throws Exception {
		// given
		String value = "errorOrComment";
		underTest.setErrorOrComment(value);
		// when
		String actual = underTest.getErrorOrComment();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetExpand() throws Exception {
		// given
		String value = "expand";
		underTest.setExpand(value);
		// when
		String actual = underTest.getExpand();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetGroups() throws Exception {
		// given
		JiraGroups value = new JiraGroups();
		underTest.setGroups(value);
		// when
		JiraGroups actual = underTest.getGroups();
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
	public void testGetKey() throws Exception {
		// given
		String value = "key";
		underTest.setKey(value);
		// when
		String actual = underTest.getKey();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLocale() throws Exception {
		// given
		String value = "locale";
		underTest.setLocale(value);
		// when
		String actual = underTest.getLocale();
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
	public void testGetSelf() throws Exception {
		// given
		String value = "self";
		underTest.setSelf(value);
		// when
		String actual = underTest.getSelf();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimeZone() throws Exception {
		// given
		String value = "timeZone";
		underTest.setTimeZone(value);
		// when
		String actual = underTest.getTimeZone();
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

}