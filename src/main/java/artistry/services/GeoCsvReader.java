package artistry.services;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import artistry.enums.Continents;
import artistry.models.geonames.Continent;
import artistry.models.geonames.Country;
import artistry.models.geonames.GeoCountry;
import artistry.models.geonames.GeoPlace;
import artistry.models.geonames.Planet;
import artistry.repositories.ContinentRepository;
import artistry.repositories.CountryRepository;
import artistry.repositories.GeoRepository;
import artistry.repositories.PlanetRepository;

@Component
public class GeoCsvReader {

	@Autowired
	private GeoRepository geoRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private ContinentRepository continentRepo;

	@Autowired
	private PlanetRepository planetRepo;

	public void readAllCountriesCsv() throws IOException, URISyntaxException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/allCountries.txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoPlace> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			GeoPlace place = geoIterator.next();
			Country country = countryRepo.findByIso(place.getCountryCode());
			place.setCountry(country);
			geoRepo.save(place);
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
			GeoCountry place = geoIterator.next();

			Country c = new Country();
			c.setAreainsqkm(place.getAreainsqkm());
			c.setCapital(place.getCapital());
			String continent = place.getContinent();
			Continent continentCheck = continentRepo.findOneByCode(continent);
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
			countryRepo.save(c);
		}
	}
}
