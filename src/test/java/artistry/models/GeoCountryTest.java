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
public class GeoCountryTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private GeoCountry underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAreainsqkm() throws Exception {
		// given
		String value = "areainsqkm";
		underTest.setAreainsqkm(value);
		// when
		String actual = underTest.getAreainsqkm();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCapital() throws Exception {
		// given
		String value = "capital";
		underTest.setCapital(value);
		// when
		String actual = underTest.getCapital();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetContinent() throws Exception {
		// given
		String value = "continent";
		underTest.setContinent(value);
		// when
		String actual = underTest.getContinent();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCountry() throws Exception {
		// given
		String value = "country";
		underTest.setCountry(value);
		// when
		String actual = underTest.getCountry();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCurrencyCode() throws Exception {
		// given
		String value = "currencyCode";
		underTest.setCurrencyCode(value);
		// when
		String actual = underTest.getCurrencyCode();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCurrencyName() throws Exception {
		// given
		String value = "currencyName";
		underTest.setCurrencyName(value);
		// when
		String actual = underTest.getCurrencyName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEquivalentFipsCode() throws Exception {
		// given
		String value = "equivalentFipsCode";
		underTest.setEquivalentFipsCode(value);
		// when
		String actual = underTest.getEquivalentFipsCode();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFips() throws Exception {
		// given
		String value = "fips";
		underTest.setFips(value);
		// when
		String actual = underTest.getFips();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetGeonameid() throws Exception {
		// given
		String value = "geonameid";
		underTest.setGeonameid(value);
		// when
		String actual = underTest.getGeonameid();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetIso() throws Exception {
		// given
		String value = "iso";
		underTest.setIso(value);
		// when
		String actual = underTest.getIso();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetIso3() throws Exception {
		// given
		String value = "iso3";
		underTest.setIso3(value);
		// when
		String actual = underTest.getIso3();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetIsoNumeric() throws Exception {
		// given
		String value = "isoNumeric";
		underTest.setIsoNumeric(value);
		// when
		String actual = underTest.getIsoNumeric();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLanguages() throws Exception {
		// given
		String value = "languages";
		underTest.setLanguages(value);
		// when
		String actual = underTest.getLanguages();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetNeighbours() throws Exception {
		// given
		String value = "neighbours";
		underTest.setNeighbours(value);
		// when
		String actual = underTest.getNeighbours();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPhone() throws Exception {
		// given
		String value = "phone";
		underTest.setPhone(value);
		// when
		String actual = underTest.getPhone();
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
	public void testGetPostalCodeFormat() throws Exception {
		// given
		String value = "postalCodeFormat";
		underTest.setPostalCodeFormat(value);
		// when
		String actual = underTest.getPostalCodeFormat();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPostalCodeRegex() throws Exception {
		// given
		String value = "postalCodeRegex";
		underTest.setPostalCodeRegex(value);
		// when
		String actual = underTest.getPostalCodeRegex();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTld() throws Exception {
		// given
		String value = "tld";
		underTest.setTld(value);
		// when
		String actual = underTest.getTld();
		// then
		assertEquals(value, actual);
	}

}
