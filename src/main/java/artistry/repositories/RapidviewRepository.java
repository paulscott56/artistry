package artistry.repositories;

import artistry.models.RapidviewEntry;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RapidviewRepository extends Neo4jRepository<RapidviewEntry, Long> {

	Optional<RapidviewEntry> findOneByRapidviewId(String id);

}
