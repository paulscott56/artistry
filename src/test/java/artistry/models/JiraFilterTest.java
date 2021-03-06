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
public class JiraFilterTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private JiraFilter underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetFilterkey() throws Exception {
		// given
		String value = "filterkey";
		underTest.setFilterkey(value);
		// when
		String actual = underTest.getFilterkey();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFiltervalue() throws Exception {
		// given
		String value = "filtervalue";
		underTest.setFiltervalue(value);
		// when
		String actual = underTest.getFiltervalue();
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

}
