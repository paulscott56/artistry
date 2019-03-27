/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SonarQubeComponentTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private SonarQubeComponent underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
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
	public void testGetMeasures() throws Exception {
		// given
		Set<SonarMeasure> value = new TreeSet<>();
		underTest.setMeasures(value);
		// when
		Set<SonarMeasure> actual = underTest.getMeasures();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
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
	public void testGetQualifier() throws Exception {
		// given
		String value = "qualifier";
		underTest.setQualifier(value);
		// when
		String actual = underTest.getQualifier();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSonarId() throws Exception {
		// given
		String value = "sonarId";
		underTest.setSonarId(value);
		// when
		String actual = underTest.getSonarId();
		// then
		assertEquals(value, actual);
	}

}