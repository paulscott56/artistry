package artistry.controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.geonames.MajorCity;
import artistry.models.geonames.Place;
import artistry.repositories.GeoRepository;
import artistry.repositories.MajorCityRepository;

@Configuration
@RestController
@Description("Controller to query geo data")
@RequestMapping("/location")
public class LocationRestController {

	static final Logger log = LoggerFactory.getLogger(LocationRestController.class);

	@Autowired
	private GeoRepository placeRepo;

	@Autowired
	private MajorCityRepository cityRepo;

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
		String regex = "(?i).*" + name + "*";
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
		String regex = "(?i).*" + name + "*";
		return cityRepo.getFuzzyByAsciiName(regex);
	}

	@RequestMapping(value = "/searchbycityname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Set<MajorCity> searchMajorCityByName(@RequestParam("name") String name) {
		String regex = "(?i).*" + name + "*";
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

}
