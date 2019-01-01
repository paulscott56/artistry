package artistry.services;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import artistry.enums.Continents;
import artistry.models.geonames.AlternateName;
import artistry.models.geonames.Continent;
import artistry.models.geonames.Country;
import artistry.models.geonames.GeoCountry;
import artistry.models.geonames.GeoPlace;
import artistry.models.geonames.Place;
import artistry.models.geonames.Planet;
import artistry.repositories.ContinentRepository;
import artistry.repositories.CountryRepository;
import artistry.repositories.GeoRepository;
import artistry.repositories.PlanetRepository;

@Component
public class GeoCsvReader {

	static final Logger log = LoggerFactory.getLogger(GeoCsvReader.class);

	@Autowired
	private GeoRepository geoRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private ContinentRepository continentRepo;

	@Autowired
	private PlanetRepository planetRepo;

	public void readAllCountriesCsv() throws IOException, URISyntaxException, ParseException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/allCountries.txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoPlace> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			try {
				GeoPlace place = geoIterator.next();
				Country country = countryRepo.findByIso(place.getCountryCode());

				Place poi = new Place();

				poi.setAdmin1Code(place.getAdmin1Code());
				poi.setAdmin2Code(place.getAdmin2Code());
				poi.setAdmin3Code(place.getAdmin3Code());
				poi.setAdmin4Code(place.getAdmin4Code());

				List<AlternateName> alternatenames = new ArrayList<>();
				String[] anames = place.getAlternateNames().split(",");
				for (String a : anames) {
					AlternateName alt = new AlternateName();
					alt.setAlternateName(a);
					alternatenames.add(alt);
				}
				poi.setAlternateNames(alternatenames);
				poi.setAsciiName(place.getAsciiName());
				poi.setCc2(place.getCc2());
				poi.setCountry(country);
				poi.setCountryCode(place.getCountryCode());
				poi.setDem(place.getDem());
				poi.setElevation(place.getElevation());
				poi.setFeatureClass(place.getFeatureClass());
				poi.setFeatureCode(place.getFeatureCode());
				poi.setGeonameId(place.getGeonameId());
				poi.setLatitude(place.getLatitude());
				poi.setLongitude(place.getLongitude());
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date moddate = simpleDateFormat.parse(place.getModificationDate());
				poi.setModificationDate(moddate);
				poi.setName(place.getName());
				poi.setPopulation(place.getPopulation());
				poi.setTimezoneId(place.getTimezoneId());

				List<Place> placelist = new ArrayList<>();
				List<Place> countrytoadd = country.getPlaces();
				if (countrytoadd == null) {
					countrytoadd = placelist;
				}
				country.setPlaces(countrytoadd);
				countryRepo.save(country);
				geoRepo.save(poi);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}

	public void createPlanetEarth() {
		String planetName = "Earth";
		Planet planet = new Planet();
		List<Continent> continents = new ArrayList<>();
		for (Continents c : Continents.values()) {
			Continent continent = new Continent();
			continent.setName(c.getKey());
			continent.setCode(c.getValue());
			continents.add(continent);
		}
		planet.setName(planetName);
		planet.setContinent(continents);
		Planet earth = planetRepo.findByName("Earth");
		if (earth == null) {
			planetRepo.save(planet);
		}
	}

	public void readCountryInfoCsv() throws IOException, URISyntaxException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/countryInfo.txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoCountry> csvToBean = new CsvToBeanBuilder<GeoCountry>(reader).withType(GeoCountry.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoCountry> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			List<Country> countriestoadd = new ArrayList<>();
			GeoCountry place = geoIterator.next();

			Country c = new Country();
			c.setAreainsqkm(place.getAreainsqkm());
			c.setCapital(place.getCapital());
			String continent = place.getContinent();
			Continent continentCheck = continentRepo.findOneByCode(continent);
			List<Country> countriesoncontinent = continentCheck.getCountry();
			if (countriesoncontinent == null) {
				countriesoncontinent = countriestoadd;
			}
			c.setContinent(continentCheck);
			c.setCountry(place.getCountry());
			c.setCurrencyCode(place.getCurrencyCode());
			c.setCurrencyName(place.getCurrencyName());
			c.setEquivalentFipsCode(place.getEquivalentFipsCode());
			c.setFips(place.getFips());
			c.setGeonameid(place.getGeonameid());
			c.setIso(place.getIso());
			c.setIso3(place.getIso3());
			c.setIsoNumeric(place.getIsoNumeric());
			c.setLanguages(place.getLanguages());
			c.setNeighbours(place.getNeighbours());
			c.setPhone(place.getPhone());
			c.setPopulation(place.getPopulation());
			c.setPostalCodeFormat(place.getPostalCodeFormat());
			c.setPostalCodeRegex(place.getPostalCodeRegex());
			c.setTld(place.getTld());
			countriesoncontinent.add(c);
			continentCheck.setCountry(countriesoncontinent);
			continentRepo.save(continentCheck);
			countryRepo.save(c);
		}
	}
}
