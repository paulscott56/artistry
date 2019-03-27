package artistry.repositories;

import artistry.models.JiraIssuesWithoutEpic;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraIssuesWithoutEpicRepository extends Neo4jRepository<JiraIssuesWithoutEpic, Long> {

}
