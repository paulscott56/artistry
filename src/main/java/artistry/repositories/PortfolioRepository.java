package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Portfolio;

@RepositoryRestResource(collectionResourceRel = "org", path = "portfolio")
public interface PortfolioRepository extends Neo4jRepository<Portfolio, Long> {

	Iterable<Portfolio> findByPortfolioName(String name);

}
