package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.NonFunctionalRequirement;

//@RepositoryRestResource(collectionResourceRel = "feature", path = "nfr")
@Repository
public interface NonFunctionalRequirementRepository extends Neo4jRepository<NonFunctionalRequirement, Long> {

}
