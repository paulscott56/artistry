// package artistry.repositories;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
// import org.springframework.boot.test.context.TestConfiguration;
// import org.springframework.context.annotation.Bean;
// import org.testcontainers.junit.jupiter.Testcontainers;
//
// @Testcontainers
// @DataNeo4jTest
// public class PlaceRepositoryTest {
//
// @Container
// private static final Neo4jContainer neo4jContainer = new
// Neo4jContainer().withAdminPassword(null);
//
// private final Session session;
//
// private final CountryRepository countryRepository;
//
// @Autowired
// CountryRepositoryTest(Session session, CountryRepository countryRepository) {
// this.session = session;
// this.countryRepository = countryRepository;
// }
//
// // @Autowired
// // private GeoRepository placeRepo;
// //
// // @Before
// // public void setup() {
// // Place place = new Place();
// // place.setAdmin1Code("adm1");
// // place.setAdmin2Code("adm2");
// // place.setAdmin3Code("adm3");
// // place.setAdmin4Code("adm4");
// // Set<AlternateName> altnames = new HashSet<>();
// // AlternateName aname = new AlternateName();
// // aname.setAlternateName("egplace");
// // place.setAlternateNames(altnames);
// // place.setAsciiName("example");
// // place.setCc2("cc2");
// // Country country = new Country();
// // country.setAreainsqkm("56");
// // country.setCapital("ExampleTown");
// // Continent continent = new Continent();
// // continent.setCode("EG");
// // Set<Country> clist = new HashSet<>();
// // clist.add(country);
// // continent.setCountry(clist);
// // continent.setHasChanges(false);
// // continent.setName("Example Continent");
// // country.setContinent(continent);
// // country.setCountry("Example");
// // country.setCurrencyCode("egdollah");
// // country.setEquivalentFipsCode("eqfips");
// // country.setFips("egfips");
// // country.setGeonameid("123xyz");
// // country.setIso("iso");
// // country.setIso3("iso3");
// // country.setIsoNumeric("123");
// // country.setLanguages("example lang");
// // country.setNeighbours("EG2");
// // country.setPhone("123456");
// // Set<Place> placelist = new HashSet<>();
// // placelist.add(place);
// // country.setPlaces(placelist);
// // country.setPopulation("1");
// // country.setPostalCodeFormat("regex 123");
// // country.setTld(".eg");
// // place.setCountry(country);
// // place.setCountryCode("EG");
// // place.setDem("DEM");
// // place.setElevation("1");
// // place.setFeatureClass("FC");
// // place.setFeatureCode("FC");
// // place.setGeonameId("123xyz2");
// // place.setLatitude("1.00");
// // place.setLongitude("-1.00");
// // place.setModificationDate(new Date());
// // place.setName("Example place");
// // place.setPopulation("1");
// // place.setTimezoneId("eg/example");
// //
// // placeRepo.save(place);
// //
// // }
// //
// // @Test
// // public void testFindByAsciiname() {
// // String asciiname = "example";
// // Set<Place> result = placeRepo.getFuzzyByAsciiName(asciiname);
// // assertNotNull(result);
// // assertEquals(1, result.size());
// // }
//
// @TestConfiguration
// static class Config {
//
// @Bean
// public org.neo4j.ogm.config.Configuration configuration() {
// var builder = new org.neo4j.ogm.config.Configuration.Builder();
// builder.uri(neo4jContainer.getBoltUrl());
// builder.withCustomProperty(ParameterConversionMode.CONFIG_PARAMETER_CONVERSION_MODE,
// ParameterConversionMode.CONVERT_NON_NATIVE_ONLY);
// return builder.build();
// }
// }
//
// }
