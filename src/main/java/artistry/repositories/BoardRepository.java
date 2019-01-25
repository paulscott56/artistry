package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.BoardEntry;

//@RepositoryRestResource(collectionResourceRel = "jira", path = "boards")
@Repository
public interface BoardRepository extends Neo4jRepository<BoardEntry, Long> {

	//boolean existsByJiraId(int teamid);

	//BoardEntry findOneByJiraId(int teamid);
}
