package artistry.repositories;

import artistry.models.SystemDemo;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemDemoRepository extends Neo4jRepository<SystemDemo, Long> {
}
