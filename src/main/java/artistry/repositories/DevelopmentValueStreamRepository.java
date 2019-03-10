package artistry.repositories;

import artistry.models.DevelopmentValueStream;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopmentValueStreamRepository extends Neo4jRepository<DevelopmentValueStream, Long> {
}
