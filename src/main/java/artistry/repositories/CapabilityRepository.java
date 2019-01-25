package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.Capability;

@RepositoryRestResource(collectionResourceRel = "enterprise", path = "capability")
public interface CapabilityRepository extends Neo4jRepository<Capability, Long> {
	

}
