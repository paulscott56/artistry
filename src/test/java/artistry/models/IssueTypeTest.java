/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IssueTypeTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private IssueType underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAvatarId() throws Exception {
		// given
		Long value = 0L;
		underTest.setAvatarId(value);
		// when
		Long actual = underTest.getAvatarId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDescription() throws Exception {
		// given
		String value = "description";
		underTest.setDescription(value);
		// when
		String actual = underTest.getDescription();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetErrorOrWarning() throws Exception {
		// given
		String value = "errorOrWarning";
		underTest.setErrorOrWarning(value);
		// when
		String actual = underTest.getErrorOrWarning();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetIconUrl() throws Exception {
		// given
		String value = "iconUrl";
		underTest.setIconUrl(value);
		// when
		String actual = underTest.getIconUrl();
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
	public void testGetJiraId() throws Exception {
		// given
		String value = "jiraId";
		underTest.setJiraId(value);
		// when
		String actual = underTest.getJiraId();
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
	public void testIsSubtask() throws Exception {
		// given
		boolean value = false;
		underTest.setSubtask(value);
		// when
		boolean actual = underTest.isSubtask();
		// then
		assertEquals(value, actual);
	}

}
