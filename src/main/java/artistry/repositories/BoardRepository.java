package artistry.repositories;

import artistry.models.BoardEntry;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardRepository extends Neo4jRepository<BoardEntry, Long> {
	Optional<BoardEntry> findOneByJiraId(int teamid);
}
