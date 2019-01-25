package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.Capability;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "capability")
@Repository
public interface CapabilityRepository extends Neo4jRepository<Capability, Long> {
	

}
