package artistry.repositories;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import artistry.models.geo.AlternateName;
import artistry.models.geo.Continent;
import artistry.models.geo.Country;
import artistry.models.geo.Place;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
@Transactional
public class PlaceRepositoryTest {
	
	@Autowired
	private GeoRepository placeRepo;
	
	@Before
	public void setup() {
		Place place = new Place();
		place.setAdmin1Code("adm1");
		place.setAdmin2Code("adm2");
		place.setAdmin3Code("adm3");
		place.setAdmin4Code("adm4");
		Set<AlternateName> altnames = new HashSet<>();
		AlternateName aname = new AlternateName();
		aname.setAlternateName("egplace");
		place.setAlternateNames(altnames);
		place.setAsciiName("example");
		place.setCc2("cc2");
		Country country = new Country();
		country.setAreainsqkm("56");
		country.setCapital("ExampleTown");
		Continent continent = new Continent();
		continent.setCode("EG");
		Set<Country> clist = new HashSet<>();
		clist.add(country);
		continent.setCountry(clist);
		continent.setHasChanges(false);
		continent.setName("Example Continent");
		country.setContinent(continent);
		country.setCountry("Example");
		country.setCurrencyCode("egdollah");
		country.setEquivalentFipsCode("eqfips");
		country.setFips("egfips");
		country.setGeonameid("123xyz");
		country.setIso("iso");
		country.setIso3("iso3");
		country.setIsoNumeric("123");
		country.setLanguages("example lang");
		country.setNeighbours("EG2");
		country.setPhone("123456");
		Set<Place> placelist = new HashSet<>();
		placelist.add(place);
		country.setPlaces(placelist);
		country.setPopulation("1");
		country.setPostalCodeFormat("regex 123");
		country.setTld(".eg");
		place.setCountry(country);
		place.setCountryCode("EG");
		place.setDem("DEM");
		place.setElevation("1");
		place.setFeatureClass("FC");
		place.setFeatureCode("FC");
		place.setGeonameId("123xyz2");
		place.setLatitude("1.00");
		place.setLongitude("-1.00");
		place.setModificationDate(new Date());
		place.setName("Example place");
		place.setPopulation("1");
		place.setTimezoneId("eg/example");
		
		placeRepo.save(place);
		
	}
	
	@Test
	public void testFindByAsciiname() {
		String asciiname = "example";
		Set<Place> result = placeRepo.getFuzzyByAsciiName(asciiname);
		assertNotNull(result);
		assertEquals(1, result.size());
	}

}
