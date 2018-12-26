package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import artistry.models.jira.SprintEntry;

public interface SprintRepository extends Neo4jRepository<SprintEntry, Long> {

}
