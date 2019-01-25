package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.LargeSolution;

@RepositoryRestResource(collectionResourceRel = "org", path = "largesolution")
public interface LargeSolutionRepository extends Neo4jRepository<LargeSolution, Long> {

	Iterable<LargeSolution> findByLargeSolutionName(String name);

}
