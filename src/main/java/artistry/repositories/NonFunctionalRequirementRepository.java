package artistry.repositories;

import artistry.models.NonFunctionalRequirement;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "feature", path = "nfr")
@Repository
public interface NonFunctionalRequirementRepository extends Neo4jRepository<NonFunctionalRequirement, Long> {

}
