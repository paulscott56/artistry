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
public class SprintEntryTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private SprintEntry underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetGoal() throws Exception {
		// given
		String value = "goal";
		underTest.setGoal(value);
		// when
		String actual = underTest.getGoal();
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
		int value = 0;
		underTest.setJiraId(value);
		// when
		int actual = underTest.getJiraId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLinkedPageCount() throws Exception {
		// given
		int value = 0;
		underTest.setLinkedPageCount(value);
		// when
		int actual = underTest.getLinkedPageCount();
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
	public void testGetRapidviewId() throws Exception {
		// given
		String value = "rapidviewId";
		underTest.setRapidviewId(value);
		// when
		String actual = underTest.getRapidviewId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSequence() throws Exception {
		// given
		int value = 0;
		underTest.setSequence(value);
		// when
		int actual = underTest.getSequence();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetState() throws Exception {
		// given
		String value = "state";
		underTest.setState(value);
		// when
		String actual = underTest.getState();
		// then
		assertEquals(value, actual);
	}

}
