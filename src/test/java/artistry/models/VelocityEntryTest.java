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
public class VelocityEntryTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private VelocityEntry underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetCompleted() throws Exception {
		// given
		Completed value = new Completed();
		underTest.setCompleted(value);
		// when
		Completed actual = underTest.getCompleted();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEstimated() throws Exception {
		// given
		Estimated value = new Estimated();
		underTest.setEstimated(value);
		// when
		Estimated actual = underTest.getEstimated();
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
	public void testGetRapidviewId() throws Exception {
		// given
		String value = "rapidviewId";
		underTest.setRapidviewId(value);
		// when
		String actual = underTest.getRapidviewId();
		// then
		assertEquals(value, actual);
	}

}
