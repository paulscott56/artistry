package artistry.repositories;

import artistry.models.SolutionBacklog;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolutionBacklogRepository extends Neo4jRepository<SolutionBacklog, Long> {
}
