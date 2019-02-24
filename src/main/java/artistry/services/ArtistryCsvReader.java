package artistry.services;

import artistry.configuration.StorageProperties;
import artistry.enums.AddressType;
import artistry.enums.Continents;
import artistry.models.*;
import artistry.repositories.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Component
public class ArtistryCsvReader {

	private static final Logger log = LoggerFactory.getLogger(ArtistryCsvReader.class);
	
	private static final String RESOURCE = StorageProperties.getLocation();

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

	public void readCountryByCode(String code) throws IOException {
		Path CSV_PATH = Paths.get(RESOURCE + code + ".txt");
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		for (GeoPlace aCsvToBean : csvToBean) {
			try {
				System.out.println("Processing place: " + aCsvToBean.getName());
				Country country = countryRepo.findOneByIso(aCsvToBean.getCountryCode());

				Place poi = new Place();

				poi.setAdmin1Code(aCsvToBean.getAdmin1Code());
				poi.setAdmin2Code(aCsvToBean.getAdmin2Code());
				poi.setAdmin3Code(aCsvToBean.getAdmin3Code());
				poi.setAdmin4Code(aCsvToBean.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
				String[] anames = aCsvToBean.getAlternateNames().split(",");
				for (String a : anames) {
					AlternateName alt = new AlternateName();
					alt.setAlternateName(a);
					alternatenames.add(alt);
				}
				poi.setAlternateNames(alternatenames);
				poi.setAsciiName(aCsvToBean.getAsciiName());
				poi.setCc2(aCsvToBean.getCc2());
				poi.setCountry(country);
				poi.setCountryCode(aCsvToBean.getCountryCode());
				poi.setDem(aCsvToBean.getDem());
				poi.setElevation(aCsvToBean.getElevation());
				poi.setFeatureClass(aCsvToBean.getFeatureClass());
				poi.setFeatureCode(aCsvToBean.getFeatureCode());
				poi.setGeonameId(aCsvToBean.getGeonameId());
				poi.setLatitude(aCsvToBean.getLatitude());
				poi.setLongitude(aCsvToBean.getLongitude());
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date moddate = simpleDateFormat.parse(aCsvToBean.getModificationDate());
				poi.setModificationDate(moddate);
				poi.setName(aCsvToBean.getName());
				poi.setPopulation(aCsvToBean.getPopulation());
				poi.setTimezoneId(aCsvToBean.getTimezoneId());

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

	public void readAllCountriesCsv() throws IOException {
		Path CSV_PATH = Paths.get(RESOURCE + "allCountries.txt");
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoPlace> csvToBean = new CsvToBeanBuilder<GeoPlace>(reader).withType(GeoPlace.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		for (GeoPlace aCsvToBean : csvToBean) {
			try {
				System.out.println("Processing place in country code: " + aCsvToBean.getCountryCode());
				Country country = countryRepo.findOneByIso(aCsvToBean.getCountryCode());

				Place poi = new Place();

				poi.setAdmin1Code(aCsvToBean.getAdmin1Code());
				poi.setAdmin2Code(aCsvToBean.getAdmin2Code());
				poi.setAdmin3Code(aCsvToBean.getAdmin3Code());
				poi.setAdmin4Code(aCsvToBean.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
				String[] anames = aCsvToBean.getAlternateNames().split(",");
				for (String a : anames) {
					AlternateName alt = new AlternateName();
					alt.setAlternateName(a);
					alternatenames.add(alt);
				}
				poi.setAlternateNames(alternatenames);
				poi.setAsciiName(aCsvToBean.getAsciiName());
				poi.setCc2(aCsvToBean.getCc2());
				poi.setCountry(country);
				poi.setCountryCode(aCsvToBean.getCountryCode());
				poi.setDem(aCsvToBean.getDem());
				poi.setElevation(aCsvToBean.getElevation());
				poi.setFeatureClass(aCsvToBean.getFeatureClass());
				poi.setFeatureCode(aCsvToBean.getFeatureCode());
				poi.setGeonameId(aCsvToBean.getGeonameId());
				poi.setLatitude(aCsvToBean.getLatitude());
				poi.setLongitude(aCsvToBean.getLongitude());
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date moddate = simpleDateFormat.parse(aCsvToBean.getModificationDate());
				poi.setModificationDate(moddate);
				poi.setName(aCsvToBean.getName());
				poi.setPopulation(aCsvToBean.getPopulation());
				poi.setTimezoneId(aCsvToBean.getTimezoneId());

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

	public void readCountryInfoCsv() throws IOException {
		Path CSV_PATH = Paths.get(RESOURCE + "countryInfo.txt");
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoCountry> csvToBean = new CsvToBeanBuilder<GeoCountry>(reader).withType(GeoCountry.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		for (GeoCountry aCsvToBean : csvToBean) {
			try {
				Set<Country> countriestoadd = new HashSet<>();

				Country c = new Country();
				c.setAreainsqkm(aCsvToBean.getAreainsqkm());
				c.setCapital(aCsvToBean.getCapital());
				String continent = aCsvToBean.getContinent();
				Continent continentCheck = continentRepo.findOneByCode(continent);
				Set<Country> countriesoncontinent = continentCheck.getCountry();
				if (countriesoncontinent == null) {
					countriesoncontinent = countriestoadd;
				}
				c.setContinent(continentCheck);
				c.setCountry(aCsvToBean.getCountry());
				c.setCurrencyCode(aCsvToBean.getCurrencyCode());
				c.setCurrencyName(aCsvToBean.getCurrencyName());
				c.setEquivalentFipsCode(aCsvToBean.getEquivalentFipsCode());
				c.setFips(aCsvToBean.getFips());
				c.setGeonameid(aCsvToBean.getGeonameid());
				c.setIso(aCsvToBean.getIso());
				c.setIso3(aCsvToBean.getIso3());
				c.setIsoNumeric(aCsvToBean.getIsoNumeric());
				c.setLanguages(aCsvToBean.getLanguages());
				c.setNeighbours(aCsvToBean.getNeighbours());
				c.setPhone(aCsvToBean.getPhone());
				c.setPopulation(aCsvToBean.getPopulation());
				c.setPostalCodeFormat(aCsvToBean.getPostalCodeFormat());
				c.setPostalCodeRegex(aCsvToBean.getPostalCodeRegex());
				c.setTld(aCsvToBean.getTld());
				countriesoncontinent.add(c);
				continentCheck.setCountry(countriesoncontinent);
				continentRepo.save(continentCheck);
				// put in a check to see if the place exists first...
				Country check = countryRepo.findOneByIso(c.getIso());
				if (check == null) {
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

	public void readCity(String file) throws IOException {
		Path CSV_PATH = Paths.get(RESOURCE + file + ".txt");
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<GeoMajorCity> csvToBean = new CsvToBeanBuilder<GeoMajorCity>(reader).withType(GeoMajorCity.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator('\t').build();
		for (GeoMajorCity aCsvToBean : csvToBean) {
			try {
				System.out.println("Processing city: " + aCsvToBean.getName());
				Country country = countryRepo.findOneByIso(aCsvToBean.getCountryCode());

				MajorCity poi = new MajorCity();

				poi.setAdmin1Code(aCsvToBean.getAdmin1Code());
				poi.setAdmin2Code(aCsvToBean.getAdmin2Code());
				poi.setAdmin3Code(aCsvToBean.getAdmin3Code());
				poi.setAdmin4Code(aCsvToBean.getAdmin4Code());

				Set<AlternateName> alternatenames = new HashSet<>();
				String[] anames = aCsvToBean.getAlternateNames().split(",");
				for (String a : anames) {
					AlternateName alt = new AlternateName();
					alt.setAlternateName(a);
					alternatenames.add(alt);
				}
				poi.setAlternateNames(alternatenames);
				poi.setAsciiName(aCsvToBean.getAsciiName());
				poi.setCc2(aCsvToBean.getCc2());
				poi.setCountry(country);
				poi.setCountryCode(aCsvToBean.getCountryCode());
				poi.setDem(aCsvToBean.getDem());
				poi.setElevation(aCsvToBean.getElevation());
				poi.setFeatureClass(aCsvToBean.getFeatureClass());
				poi.setFeatureCode(aCsvToBean.getFeatureCode());
				poi.setGeonameId(aCsvToBean.getGeonameId());
				poi.setLatitude(aCsvToBean.getLatitude());
				poi.setLongitude(aCsvToBean.getLongitude());
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date moddate = simpleDateFormat.parse(aCsvToBean.getModificationDate());
				poi.setModificationDate(moddate);
				poi.setName(aCsvToBean.getName());
				poi.setPopulation(aCsvToBean.getPopulation());
				poi.setTimezoneId(aCsvToBean.getTimezoneId());

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

	public void readRolesCsv() throws IOException {
		Path CSV_PATH = Paths.get(RESOURCE + "roles.csv");
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<PersonRole> csvToBean = new CsvToBeanBuilder<PersonRole>(reader).withType(PersonRole.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator(',').withSkipLines(1).build();
		for (PersonRole aCsvToBean : csvToBean) {
			try {
				log.info("Importing role: " + aCsvToBean.getRoleName() + " " + aCsvToBean.getRole().toString());
				// first check the role doesn't alraedy exist
				Optional<PersonRole> rec = rolesRepo.findByRole(aCsvToBean.getRole());
				if (!rec.isPresent()) {
					rolesRepo.save(aCsvToBean);
				}
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}

	@Async
	public void importPeople(MultipartFile file) throws IOException {
		log.info("Parsing file: " + RESOURCE + file.getOriginalFilename());
		Path CSV_PATH = Paths.get(RESOURCE + file.getOriginalFilename());
		Reader reader = Files.newBufferedReader(CSV_PATH);
		CsvToBean<PersonCsv> csvToBean = new CsvToBeanBuilder<PersonCsv>(reader).withType(PersonCsv.class)
				.withIgnoreLeadingWhiteSpace(true).withSeparator(',').withSkipLines(1).build();
		for (PersonCsv aCsvToBean : csvToBean) {
			try {
				Person p = new Person();
				p.setActive(aCsvToBean.isActive());
				Address address = new Address();
				Set<String> addlines = new HashSet<>();
				String[] lines = aCsvToBean.getAddress().split(",");
				Collections.addAll(addlines, lines);
				address.setAddressLine(addlines);
				address.setAddressType(AddressType.PERSON);
				p.setAddress(address);
				p.setCountryCode(aCsvToBean.getCountryCode());
				p.setDateCreated(LocalDateTime.now());
				EmailAddress emailAddress = new EmailAddress();
				emailAddress.setPersonalEmail(aCsvToBean.getPersonalEmail());
				emailAddress.setWorkEmail(aCsvToBean.getWorkemail());
				p.setEmailAddress(emailAddress);
				p.setName(aCsvToBean.getName());
				p.setNickname(aCsvToBean.getNickname());
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setOfficePhone(aCsvToBean.getWorkPhone());
				phoneNumber.setMobilePhone(aCsvToBean.getMobilePhone());
				p.setPhoneNumber(phoneNumber);
				p.setSurname(aCsvToBean.getSurname());
				p.setUsername(aCsvToBean.getUsername());

			} catch (Exception e) {
				log.error(e.getMessage());
			}

		}
	}
}
