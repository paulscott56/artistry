/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.Country;
import artistry.models.MajorCity;
import artistry.models.Place;
import artistry.repositories.CountryRepository;
import artistry.repositories.GeoRepository;
import artistry.repositories.MajorCityRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import utils.JsonUtils;

import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = LocationRestController.class)
public class LocationRestControllerTest {

	@Autowired
	private LocationRestController underTest;

	@MockBean
	private MajorCityRepository cityRepo;

	@MockBean
	private CountryRepository countryRepo;

	@MockBean
	private GeoRepository placeRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testAddMajorCity_MVC_post() throws Exception {
		// given
		MajorCity majorCity = new MajorCity();
		// when
		MvcResult actual = mockMvc.perform(post("/location/addmajorcity")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(majorCity, true))
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testAddPlace_MVC_post() throws Exception {
		// given
		Place place = new Place();
		// when
		MvcResult actual = mockMvc.perform(post("/location/addplace")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(place, true))
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAllCities_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/location/getallcities")
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAllCountries_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/location/getallcountries")
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAllPlaces_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/location/getallplaces")
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetCountriesByName_MVC_get() throws Exception {
		// given
		String country = "country";
		// when
		MvcResult actual = mockMvc.perform(get("/location/getcountrybyname?country="+country)
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testSearchMajorCityByName_MVC_get() throws Exception {
		// given
		String name = "name";
		// when
		MvcResult actual = mockMvc.perform(get("/location/searchbycityname?name="+name)
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testSearchCityByName_MVC_get() throws Exception {
		// given
		String name = "name";
		// when
		MvcResult actual = mockMvc.perform(get("/location/searchcitybyname?name="+name)
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testSearchPlaceByName_MVC_get() throws Exception {
		// given
		String name = "name";
		// when
		MvcResult actual = mockMvc.perform(get("/location/searchplacebyname?name="+name)
				.accept("application/json"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testAddMajorCity() throws Exception {
		// given
		MajorCity majorCity = new MajorCity();
		// when
		MajorCity actual = underTest.addMajorCity(majorCity);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testAddPlace() throws Exception {
		// given
		Place place = new Place();
		// when
		Place actual = underTest.addPlace(place);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllCities() throws Exception {
		// given
		// when
		Iterable<MajorCity> actual = underTest.getAllCities();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllCountries() throws Exception {
		// given
		// when
		Iterable<Country> actual = underTest.getAllCountries();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllPlaces() throws Exception {
		// given
		// when
		Iterable<Place> actual = underTest.getAllPlaces();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetCountriesByName() throws Exception {
		// given
		String countryName = "countryName";
		// when
		Country actual = underTest.getCountriesByName(countryName);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testSearchCityByName() throws Exception {
		// given
		String name = "name";
		// when
		Set<MajorCity> actual = underTest.searchCityByName(name);
		// then
		assertArrayEquals(new Object[]{}, actual.toArray());
	}

	@Test
	public void testSearchMajorCityByName() throws Exception {
		// given
		String name = "name";
		// when
		Set<MajorCity> actual = underTest.searchMajorCityByName(name);
		// then
		assertArrayEquals(new Object[]{}, actual.toArray());
	}

	@Test
	public void testSearchPlaceByName() throws Exception {
		// given
		String name = "name";
		// when
		Set<Place> actual = underTest.searchPlaceByName(name);
		// then
		assertArrayEquals(new Object[]{}, actual.toArray());
	}

}
