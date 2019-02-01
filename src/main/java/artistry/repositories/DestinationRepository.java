package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Destination;

@Repository
public interface DestinationRepository extends Neo4jRepository<Destination, Long> {

}
