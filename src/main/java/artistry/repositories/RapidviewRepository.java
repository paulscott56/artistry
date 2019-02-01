package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.RapidviewEntry;

@Repository
public interface RapidviewRepository extends Neo4jRepository<RapidviewEntry, Long> {

	Optional<RapidviewEntry> findOneByRapidviewId(String id);

}
