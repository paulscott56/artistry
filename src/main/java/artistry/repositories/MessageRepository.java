package artistry.repositories;

import artistry.models.Destination;
import artistry.models.WebHookMessage;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends Neo4jRepository<WebHookMessage, Long> {

	List<WebHookMessage> findAllByDestination(Destination destination);

}
