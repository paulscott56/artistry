package artistry.repositories;

import artistry.models.JiraUser;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraUserRepository extends Neo4jRepository<JiraUser, Long> {

}
