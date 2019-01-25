package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.SprintEntry;

@Repository
public interface SprintRepository extends Neo4jRepository<SprintEntry, Long> {

}
