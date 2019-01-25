package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.VelocityEntry;

@Repository
public interface VelocityRepository extends Neo4jRepository<VelocityEntry, Long> {

}
