package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import artistry.models.VelocityEntry;

public interface VelocityRepository extends Neo4jRepository<VelocityEntry, Long> {

}
