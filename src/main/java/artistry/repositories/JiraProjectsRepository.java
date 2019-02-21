package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import artistry.models.JiraProjects;

public interface JiraProjectsRepository extends Neo4jRepository<JiraProjects, Long> {

}
