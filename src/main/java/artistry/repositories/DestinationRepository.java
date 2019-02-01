package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import artistry.models.Destination;

@Repository
public interface DestinationRepository extends Neo4jRepository<Destination, Long> {

	@Transactional
	// need to translate this to cypher still @Query("update Destination d set
	// d.online = true where d.id = ?")
	int setDestinationOnline(Long id);

	@Transactional
	// need to translate this to cypher still @Query("update Destination d set
	// d.online = false where d.id = ?")
	int setDestinationOffline(Long id);

}
