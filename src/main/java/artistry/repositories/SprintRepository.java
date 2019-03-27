package artistry.repositories;

import artistry.models.SprintEntry;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends Neo4jRepository<SprintEntry, Long> {

}
