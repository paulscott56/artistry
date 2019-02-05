package artistry.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import artistry.models.Destination;

@Repository
public interface DestinationRepository extends Neo4jRepository<Destination, Long> {

	@Transactional
	@Query("MATCH (n:Destination) WHERE ID(n) = {0} SET n.online = true")
	void setDestinationOnline(Long id);

	@Transactional
	@Query("MATCH (n:Destination) WHERE ID(n) = {0} SET n.online = false")
	void setDestinationOffline(Long id);

}
