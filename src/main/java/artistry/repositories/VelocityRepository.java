package artistry.repositories;

import artistry.models.VelocityEntry;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VelocityRepository extends Neo4jRepository<VelocityEntry, Long> {

}
