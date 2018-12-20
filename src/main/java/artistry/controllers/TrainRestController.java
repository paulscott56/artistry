package artistry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.Train;
import artistry.repositories.TrainRepository;

@Configuration
@RestController
@Description("Trains Controller, to facilitate CRUD messages for overall Agile Release Trains")
@CacheConfig(cacheNames = "trains")
@RequestMapping("/train")
public class TrainRestController {

	@Autowired
	private TrainRepository repo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Iterable<Train> getAllTrains() {
		return repo.findAll();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Train createTrain(Train train) {
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Train updateTrain(Train train) {
		return null;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Train deleteTrain(Train train) {
		return null;
	}

}