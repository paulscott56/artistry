package artistry.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.geonames.Place;
import artistry.repositories.GeoRepository;
import artistry.services.GeoCsvReader;

@Configuration
@RestController
@Description("Controller to simplify the import of the geo data")
@RequestMapping("/geo")
public class GeoImportController {

	static final Logger log = LoggerFactory.getLogger(GeoImportController.class);

	@Autowired
	private GeoRepository repo;

	@Autowired
	private GeoCsvReader csvReader;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<Place> getAllPlaces() {
		return repo.findAll();
	}

	@RequestMapping(value = "/getbyname", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<Place> getPlaceByName(@RequestParam("name") String name) {
		return repo.findAllByName(name);
	}

	@RequestMapping(value = "/searchbyname", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Set<Place> searchPlaceByName(@RequestParam("name") String name) {
		String regex = "(?i).*" + name + "*";
		return repo.getFuzzyByAsciiName(regex);
	}

	@RequestMapping(value = "/import", method = RequestMethod.GET)
	@ResponseBody
	public String importData() throws IOException, URISyntaxException, ParseException {
		csvReader.createPlanetEarth();
		csvReader.readCountryInfoCsv();
		csvReader.readAllCountriesCsv();
		return "hello";
	}

}
