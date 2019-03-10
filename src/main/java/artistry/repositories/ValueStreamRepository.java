package artistry.repositories;

import artistry.models.ValueStream;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueStreamRepository extends Neo4jRepository<ValueStream, Long> {
}
