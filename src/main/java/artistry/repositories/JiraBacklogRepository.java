package artistry.repositories;

import artistry.models.JiraBacklog;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraBacklogRepository extends Neo4jRepository<JiraBacklog, Long> {

}
