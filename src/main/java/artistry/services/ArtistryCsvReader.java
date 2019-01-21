package artistry.services;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import artistry.enums.AddressType;
import artistry.enums.Continents;
import artistry.models.geo.AlternateName;
import artistry.models.geo.Continent;
import artistry.models.geo.Country;
import artistry.models.geo.GeoCountry;
import artistry.models.geo.GeoMajorCity;
import artistry.models.geo.GeoPlace;
import artistry.models.geo.MajorCity;
import artistry.models.geo.Place;
import artistry.models.geo.Planet;
import artistry.models.person.Address;
import artistry.models.person.EmailAddress;
import artistry.models.person.Person;
import artistry.models.person.PersonCsv;
import artistry.models.person.PersonRole;
import artistry.models.person.PhoneNumber;
import artistry.repositories.ContinentRepository;
import artistry.repositories.CountryRepository;
import artistry.repositories.GeoRepository;
import artistry.repositories.MajorCityRepository;
import artistry.repositories.PlanetRepository;
import artistry.repositories.RolesRepository;

@Component
public class ArtistryCsvReader {

	static final Logger log = LoggerFactory.getLogger(ArtistryCsvReader.class);

	@Autowired
	private GeoRepository geoRepo;

	@Autowired
	private MajorCityRepository cityRepo;

	@Autowired
	private CountryRepository countryRepo;

	@Autowired
	private ContinentRepository continentRepo;

	@Autowired
	private PlanetRepository planetRepo;

	@Autowired
	private RolesRepository rolesRepo;

	public void readCountryByCode(String code) throws URISyntaxException, IOException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/" + code + ".txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoPlace> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			try {
				GeoPlace place = geoIterator.next();
				System.out.println("Processing place: " + place.getName());
				Country country = countryRepo.findOneByIso(place.getCountryCode());

				Place poi = new Place();

				poi.setAdmin1Code(place.getAdmin1Code());
				poi.setAdmin2Code(place.getAdmin2Code());
				poi.setAdmin3Code(place.getAdmin3Code());
				poi.setAdmin4Code(place.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
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

				Set<Place> placelist = new HashSet<>();
				Set<Place> countrytoadd = country.getPlaces();
				if (countrytoadd == null) {
					countrytoadd = placelist;
				}
				country.setPlaces(countrytoadd);
				countryRepo.save(country);
				geoRepo.save(poi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				log.error(e.getMessage());
			}
		}

	}

	public void readAllCountriesCsv() throws IOException, URISyntaxException, ParseException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/allCountries.txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoPlace> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			try {
				GeoPlace place = geoIterator.next();
				System.out.println("Processing place in country code: " + place.getCountryCode());
				Country country = countryRepo.findOneByIso(place.getCountryCode());

				Place poi = new Place();

				poi.setAdmin1Code(place.getAdmin1Code());
				poi.setAdmin2Code(place.getAdmin2Code());
				poi.setAdmin3Code(place.getAdmin3Code());
				poi.setAdmin4Code(place.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
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

				Set<Place> placelist = new HashSet<>();
				Set<Place> countrytoadd = country.getPlaces();
				if (countrytoadd == null) {
					countrytoadd = placelist;
				}
				country.setPlaces(countrytoadd);
				countryRepo.save(country);
				geoRepo.save(poi);
			} catch (Exception e) {
				log.error(e.getMessage());
				System.out.println(e.getMessage());
			}
		}
	}

	public void createPlanetEarth() {
		String planetName = "Earth";
		Planet planet = new Planet();
		Set<Continent> continents = new HashSet<>();
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
			System.out.println("Creating planet");
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
			try {
				Set<Country> countriestoadd = new HashSet<>();
				GeoCountry place = geoIterator.next();

				Country c = new Country();
				c.setAreainsqkm(place.getAreainsqkm());
				c.setCapital(place.getCapital());
				String continent = place.getContinent();
				Continent continentCheck = continentRepo.findOneByCode(continent);
				Set<Country> countriesoncontinent = continentCheck.getCountry();
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
				// put in a check to see if the place exists first...
				Country check = countryRepo.findOneByIso(c.getIso());
				if (check.equals(null)) {
					System.out.println("Saving country: " + c.getCountry());
					countryRepo.save(c);
				} else {
					System.out.println("Country: " + c.getCountry() + " already exists!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void readCity(String file) throws URISyntaxException, IOException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/" + file + ".txt").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoMajorCity> csvToBean = new CsvToBeanBuilder<GeoMajorCity>(reader).withType(GeoMajorCity.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		Iterator<GeoMajorCity> geoIterator = csvToBean.iterator();
		while (geoIterator.hasNext()) {
			try {
				GeoMajorCity place = geoIterator.next();
				System.out.println("Processing city: " + place.getName());
				Country country = countryRepo.findOneByIso(place.getCountryCode());

				MajorCity poi = new MajorCity();

				poi.setAdmin1Code(place.getAdmin1Code());
				poi.setAdmin2Code(place.getAdmin2Code());
				poi.setAdmin3Code(place.getAdmin3Code());
				poi.setAdmin4Code(place.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
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

				Set<Place> placelist = new HashSet<>();
				Set<Place> countrytoadd = country.getPlaces();
				if (countrytoadd == null) {
					countrytoadd = placelist;
				}
				country.setPlaces(countrytoadd);
				countryRepo.save(country);
				cityRepo.save(poi);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				log.error(e.getMessage());
			}
		}

	}

	public void readRolesCsv() throws URISyntaxException, IOException {
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/roles.csv").toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<PersonRole> csvToBean = new CsvToBeanBuilder<PersonRole>(reader).withType(PersonRole.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator(',').withSkipLines(1).build();
		Iterator<PersonRole> roleIterator = csvToBean.iterator();
		while (roleIterator.hasNext()) {
			try {
				PersonRole role = roleIterator.next();
				log.info("Importing role: " + role.getRoleName() + " " + role.getRole().toString());
				rolesRepo.save(role);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Async
	public void importPeople(MultipartFile file) throws URISyntaxException, IOException {
		log.info("Parsing file: " + ClassLoader.getSystemResource("csv/").toString() + file.getOriginalFilename());
		Path CSV_PATH = Paths.get(ClassLoader.getSystemResource("csv/" + file.getOriginalFilename()).toURI());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<PersonCsv> csvToBean = new CsvToBeanBuilder<PersonCsv>(reader).withType(PersonCsv.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator(',').withSkipLines(1).build();
		Iterator<PersonCsv> personIterator = csvToBean.iterator();
		while (personIterator.hasNext()) {
			try {
				PersonCsv pcsv = personIterator.next();
				Person p = new Person();
				p.setActive(pcsv.isActive());
				Address address = new Address();
				Set<String> addlines = new HashSet<>();
				String[] lines = pcsv.getAddress().split(",");
				for (String l : lines) {
					addlines.add(l);
				}
				address.setAddressLine(addlines);
				address.setAddressType(AddressType.PERSON);
				p.setAddress(address);
				p.setCountryCode(pcsv.getCountryCode());
				p.setDateCreated(LocalDateTime.now());
				EmailAddress emailAddress = new EmailAddress();
				emailAddress.setPersonalEmail(pcsv.getPersonalEmail());
				emailAddress.setWorkEmail(pcsv.getWorkemail());
				p.setEmailAddress(emailAddress);
				p.setName(pcsv.getName());
				p.setNickname(pcsv.getNickname());
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setOfficePhone(pcsv.getWorkPhone());
				phoneNumber.setMobilePhone(pcsv.getMobilePhone());
				p.setPhoneNumber(phoneNumber);
				p.setSurname(pcsv.getSurname());
				p.setUsername(pcsv.getUsername());
				
			} catch (Exception e) {
				log.error(e.getMessage());
			}

		}
	}
}
