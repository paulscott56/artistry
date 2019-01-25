package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Portfolio;

//@RepositoryRestResource(collectionResourceRel = "org", path = "portfolio")
@Repository
public interface PortfolioRepository extends Neo4jRepository<Portfolio, Long> {

	Iterable<Portfolio> findByPortfolioName(String name);

}
