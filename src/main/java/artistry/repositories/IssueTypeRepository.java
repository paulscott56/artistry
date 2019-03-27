package artistry.repositories;

import artistry.models.IssueType;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IssueTypeRepository extends Neo4jRepository<IssueType, Long> {

	Optional<IssueType> findByJiraId(String jiraId);

}