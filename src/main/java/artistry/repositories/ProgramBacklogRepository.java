package artistry.repositories;

import artistry.models.ProgramBacklog;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramBacklogRepository extends Neo4jRepository<ProgramBacklog, Long> {
}
