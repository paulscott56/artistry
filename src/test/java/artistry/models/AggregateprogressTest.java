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
public class AggregateprogressTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Aggregateprogress underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetProgress() throws Exception {
		// given
		Integer value = 0;
		underTest.setProgress(value);
		// when
		Integer actual = underTest.getProgress();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTotal() throws Exception {
		// given
		Integer value = 0;
		underTest.setTotal(value);
		// when
		Integer actual = underTest.getTotal();
		// then
		assertEquals(value, actual);
	}

}
