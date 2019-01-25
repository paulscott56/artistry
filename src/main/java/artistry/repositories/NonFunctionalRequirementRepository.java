package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.NonFunctionalRequirement;

@RepositoryRestResource(collectionResourceRel = "feature", path = "nfr")
public interface NonFunctionalRequirementRepository extends Neo4jRepository<NonFunctionalRequirement, Long> {

}
