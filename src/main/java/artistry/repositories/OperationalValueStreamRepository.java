package artistry.repositories;

import artistry.models.OperationalValueStream;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationalValueStreamRepository extends Neo4jRepository<OperationalValueStream, Long> {
}
