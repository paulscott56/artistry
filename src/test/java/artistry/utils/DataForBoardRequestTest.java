/** This class was generated by GenTest@Mobacar */
package artistry.utils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DataForBoardRequestTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private DataForBoardRequest underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
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
	public void testGetPreset() throws Exception {
		// given
		String value = "preset";
		underTest.setPreset(value);
		// when
		String actual = underTest.getPreset();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetProjectIds() throws Exception {
		// given
		String[] value = new String[]{};
		underTest.setProjectIds(value);
		// when
		String[] actual = underTest.getProjectIds();
		// then
		assertArrayEquals(value, actual);
	}

}
