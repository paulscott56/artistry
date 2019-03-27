/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PlaceTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Place underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAdmin1Code() throws Exception {
		// given
		String value = "admin1Code";
		underTest.setAdmin1Code(value);
		// when
		String actual = underTest.getAdmin1Code();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAdmin2Code() throws Exception {
		// given
		String value = "admin2Code";
		underTest.setAdmin2Code(value);
		// when
		String actual = underTest.getAdmin2Code();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAdmin3Code() throws Exception {
		// given
		String value = "admin3Code";
		underTest.setAdmin3Code(value);
		// when
		String actual = underTest.getAdmin3Code();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAdmin4Code() throws Exception {
		// given
		String value = "admin4Code";
		underTest.setAdmin4Code(value);
		// when
		String actual = underTest.getAdmin4Code();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAlternateNames() throws Exception {
		// given
		Set<AlternateName> value = new TreeSet<>();
		underTest.setAlternateNames(value);
		// when
		Set<AlternateName> actual = underTest.getAlternateNames();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetAsciiName() throws Exception {
		// given
		String value = "asciiName";
		underTest.setAsciiName(value);
		// when
		String actual = underTest.getAsciiName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCc2() throws Exception {
		// given
		String value = "cc2";
		underTest.setCc2(value);
		// when
		String actual = underTest.getCc2();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCountry() throws Exception {
		// given
		Country value = new Country();
		underTest.setCountry(value);
		// when
		Country actual = underTest.getCountry();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCountryCode() throws Exception {
		// given
		String value = "countryCode";
		underTest.setCountryCode(value);
		// when
		String actual = underTest.getCountryCode();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDem() throws Exception {
		// given
		String value = "dem";
		underTest.setDem(value);
		// when
		String actual = underTest.getDem();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetElevation() throws Exception {
		// given
		String value = "elevation";
		underTest.setElevation(value);
		// when
		String actual = underTest.getElevation();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFeatureClass() throws Exception {
		// given
		String value = "featureClass";
		underTest.setFeatureClass(value);
		// when
		String actual = underTest.getFeatureClass();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFeatureCode() throws Exception {
		// given
		String value = "featureCode";
		underTest.setFeatureCode(value);
		// when
		String actual = underTest.getFeatureCode();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetGeonameId() throws Exception {
		// given
		String value = "geonameId";
		underTest.setGeonameId(value);
		// when
		String actual = underTest.getGeonameId();
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
	public void testGetLatitude() throws Exception {
		// given
		String value = "latitude";
		underTest.setLatitude(value);
		// when
		String actual = underTest.getLatitude();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLongitude() throws Exception {
		// given
		String value = "longitude";
		underTest.setLongitude(value);
		// when
		String actual = underTest.getLongitude();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetModificationDate() throws Exception {
		// given
		Date value = new Date();
		underTest.setModificationDate(value);
		// when
		Date actual = underTest.getModificationDate();
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
	public void testGetPopulation() throws Exception {
		// given
		String value = "population";
		underTest.setPopulation(value);
		// when
		String actual = underTest.getPopulation();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimezoneId() throws Exception {
		// given
		String value = "timezoneId";
		underTest.setTimezoneId(value);
		// when
		String actual = underTest.getTimezoneId();
		// then
		assertEquals(value, actual);
	}

}
