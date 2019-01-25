package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.LargeSolution;

//@RepositoryRestResource(collectionResourceRel = "org", path = "largesolution")
@Repository
public interface LargeSolutionRepository extends Neo4jRepository<LargeSolution, Long> {

	Iterable<LargeSolution> findByLargeSolutionName(String name);

}
