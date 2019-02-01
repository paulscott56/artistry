package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.webhook.WebHookMessage;

@Repository
public interface MessageRepository extends Neo4jRepository<WebHookMessage, Long> {

}
