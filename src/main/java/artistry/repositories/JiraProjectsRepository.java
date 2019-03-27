package artistry.repositories;

import artistry.models.JiraProjects;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface JiraProjectsRepository extends Neo4jRepository<JiraProjects, Long> {

}
