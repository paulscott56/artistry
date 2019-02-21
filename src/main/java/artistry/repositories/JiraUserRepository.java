package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.JiraUser;

@Repository
public interface JiraUserRepository extends Neo4jRepository<JiraUser, Long> {

}
