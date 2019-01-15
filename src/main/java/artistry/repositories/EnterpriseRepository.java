package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Enterprise;

@RepositoryRestResource(collectionResourceRel = "organization", path = "enterprise")
public interface EnterpriseRepository extends Neo4jRepository<Enterprise, Long> {

}