package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.BoardEntry;

@Repository
public interface BoardRepository extends Neo4jRepository<BoardEntry, Long> {
	Optional<BoardEntry> findOneByJiraId(int teamid);
}
