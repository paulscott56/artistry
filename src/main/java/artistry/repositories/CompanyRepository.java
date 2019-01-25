package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Company;

//@RepositoryRestResource(collectionResourceRel = "person", path = "company")
@Repository
public interface CompanyRepository extends Neo4jRepository<Company, Long> {

}
