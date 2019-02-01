package artistry.repositories;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Destination;
import artistry.models.WebHookMessage;

@Repository
public interface MessageRepository extends Neo4jRepository<WebHookMessage, Long> {

	List<WebHookMessage> findAllByDestinationOrderByIdAsc(Destination destination);

}
