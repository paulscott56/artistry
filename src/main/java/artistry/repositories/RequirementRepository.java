package artistry.repositories;

import artistry.models.Requirement;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "feature", path = "requirement")
@Repository
public interface RequirementRepository extends Neo4jRepository<Requirement, Long> {

}
