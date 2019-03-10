package artistry.repositories;

import artistry.models.ProgramKanban;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramKanbanRepository extends Neo4jRepository<ProgramKanban, Long> {
}
