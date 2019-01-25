package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.Company;

@RepositoryRestResource(collectionResourceRel = "person", path = "company")
public interface CompanyRepository extends Neo4jRepository<Company, Long> {

}
