package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import artistry.models.SprintEntry;

public interface SprintRepository extends Neo4jRepository<SprintEntry, Long> {

}
