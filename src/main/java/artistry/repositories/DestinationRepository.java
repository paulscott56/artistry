package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.webhook.Destination;

@Repository
public interface DestinationRepository extends Neo4jRepository<Destination, Long> {

}
