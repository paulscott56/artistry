package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.JiraIssuesWithoutEpic;

@Repository
public interface JiraIssuesWithoutEpicRepository extends Neo4jRepository<JiraIssuesWithoutEpic, Long> {

}