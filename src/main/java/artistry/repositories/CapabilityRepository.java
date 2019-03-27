package artistry.repositories;

import artistry.models.Capability;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "capability")
@Repository
public interface CapabilityRepository extends Neo4jRepository<Capability, Long> {
	

}
