package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.IssueType;

@Repository
public interface IssueTypeRepository extends Neo4jRepository<IssueType, Long> {

	Optional<IssueType> findByJiraId(String jiraId);

}