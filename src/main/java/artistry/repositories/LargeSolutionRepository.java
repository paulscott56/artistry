package artistry.repositories;

import artistry.models.LargeSolution;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LargeSolutionRepository extends Neo4jRepository<LargeSolution, Long> {

	Iterable<LargeSolution> findByLargeSolutionName(String name);

}
