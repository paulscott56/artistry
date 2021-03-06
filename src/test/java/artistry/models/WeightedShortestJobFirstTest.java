/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class WeightedShortestJobFirstTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private WeightedShortestJobFirst underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAttachedDocuments() throws Exception {
		// given
		Set<Document> value = new TreeSet<>();
		underTest.setAttachedDocuments(value);
		// when
		Set<Document> actual = underTest.getAttachedDocuments();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetCostOfDelay() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setCostOfDelay(value);
		// when
		BigDecimal actual = underTest.getCostOfDelay();
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
	public void testGetJobSize() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setJobSize(value);
		// when
		BigDecimal actual = underTest.getJobSize();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRiskReductionOrOpportunity() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setRiskReductionOrOpportunity(value);
		// when
		BigDecimal actual = underTest.getRiskReductionOrOpportunity();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimeCriticality() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setTimeCriticality(value);
		// when
		BigDecimal actual = underTest.getTimeCriticality();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetUserBusinessValue() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setUserBusinessValue(value);
		// when
		BigDecimal actual = underTest.getUserBusinessValue();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWsjfValue() throws Exception {
		// given
		BigDecimal value = BigDecimal.valueOf(0);
		underTest.setWsjfValue(value);
		// when
		BigDecimal actual = underTest.getWsjfValue();
		// then
		assertEquals(value, actual);
	}

}
