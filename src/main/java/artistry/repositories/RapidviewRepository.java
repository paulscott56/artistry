package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import artistry.models.RapidviewEntry;

public interface RapidviewRepository extends Neo4jRepository<RapidviewEntry, Long> {

	boolean existsByRapidviewId(Long id);

	RapidviewEntry findOneByRapidviewId(String id);

}
