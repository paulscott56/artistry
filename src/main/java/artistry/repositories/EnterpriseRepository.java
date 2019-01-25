package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Enterprise;

//@RepositoryRestResource(collectionResourceRel = "organization", path = "enterprise")
@Repository
public interface EnterpriseRepository extends Neo4jRepository<Enterprise, Long> {

	Iterable<Enterprise> findByEnterpriseName(String name);

}
