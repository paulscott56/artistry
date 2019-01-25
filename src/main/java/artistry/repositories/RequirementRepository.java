package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Requirement;

//@RepositoryRestResource(collectionResourceRel = "feature", path = "requirement")
@Repository
public interface RequirementRepository extends Neo4jRepository<Requirement, Long> {

}
