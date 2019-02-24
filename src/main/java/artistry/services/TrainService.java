package artistry.services;

import artistry.models.Train;
import artistry.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class TrainService {

	@Autowired
	private TrainRepository trainRepo;

	@Transactional(readOnly = true)
	public Train findByName(String name) {
		return trainRepo.findByName(name);
	}
}
