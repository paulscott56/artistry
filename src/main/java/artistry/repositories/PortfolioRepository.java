package artistry.repositories;

import artistry.models.Portfolio;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "org", path = "portfolio")
@Repository
public interface PortfolioRepository extends Neo4jRepository<Portfolio, Long> {

	Iterable<Portfolio> findByPortfolioName(String name);

}
