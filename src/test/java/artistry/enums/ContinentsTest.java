/** This class was generated by GenTest@Mobacar */
package artistry.enums;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContinentsTest {

	// select value to be tested in each test method or use default one of setupTest
	private Continents underTest;

	@Before
	public void setupTest() {
		// prepare test
		underTest = Continents.AF;
	}

	@Test
	public void testGetKey() throws Exception {
		// given
		// when
		String actual = underTest.getKey();
		// then
		assertEquals("", actual);
	}

	@Test
	public void testGetValue() throws Exception {
		// given
		// when
		String actual = underTest.getValue();
		// then
		assertEquals("", actual);
	}

}
