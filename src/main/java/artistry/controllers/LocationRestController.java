package artistry.controllers;

import artistry.models.Country;
import artistry.models.MajorCity;
import artistry.models.Place;
import artistry.repositories.CountryRepository;
import artistry.repositories.GeoRepository;
import artistry.repositories.MajorCityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Configuration
@RestController
@Description("Controller to query geo data")
@RequestMapping("/location")
class LocationRestController {

	static final Logger log = LoggerFactory.getLogger(LocationRestController.class);

	@Autowired
	private GeoRepository placeRepo;

	@Autowired
	private MajorCityRepository cityRepo;

	@Autowired
	private CountryRepository countryRepo;

	@RequestMapping(value = "/getallplaces", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<Place> getAllPlaces() {
		return placeRepo.findAll();
	}

	@RequestMapping(value = "/searchplacebyname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Set<Place> searchPlaceByName(@RequestParam("name") String name) {
		String regex = "(?i)" + name;
		return placeRepo.getFuzzyByAsciiName(regex);
	}

	@RequestMapping(value = "/getallcities", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<MajorCity> getAllCities() {
		return cityRepo.findAll();
	}

	@RequestMapping(value = "/searchcitybyname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Set<MajorCity> searchCityByName(@RequestParam("name") String name) {
		String regex = "(?i)" + name;
		return cityRepo.getFuzzyByAsciiName(regex);
	}

	@RequestMapping(value = "/searchbycityname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Set<MajorCity> searchMajorCityByName(@RequestParam("name") String name) {
		String regex = "(?i)" + name;
		return cityRepo.getFuzzyByAsciiName(regex);
	}

	@RequestMapping(value = "/addmajorcity", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public MajorCity addMajorCity(@RequestBody MajorCity majorCity) {
		return cityRepo.save(majorCity);
	}

	@RequestMapping(value = "/addplace", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Place addPlace(@RequestBody Place place) {
		return placeRepo.save(place);
	}

	@RequestMapping(value = "/getallcountries", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<Country> getAllCountries() {
		return countryRepo.findAll();
	}

	@RequestMapping(value = "/getcountrybyname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Country getCountriesByName(@RequestParam("country") String countryName) {
		String regex = "(?i)" + countryName;
		return countryRepo.findByCountry(regex);
	}

}
