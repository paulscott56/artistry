package artistry.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artistry.models.train.Train;
import artistry.repositories.TrainRepository;

@Service
public class TrainService {

	@Autowired
	private TrainRepository trainRepo;

	@Transactional(readOnly = true)
	public Train findByName(String name) {
		Train result = trainRepo.findByName(name);
		return result;
	}
}
