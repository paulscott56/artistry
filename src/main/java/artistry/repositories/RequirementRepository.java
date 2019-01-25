package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Requirement;

@RepositoryRestResource(collectionResourceRel = "feature", path = "requirement")
public interface RequirementRepository extends Neo4jRepository<Requirement, Long> {

}
