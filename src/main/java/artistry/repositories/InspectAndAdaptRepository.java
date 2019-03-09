package artistry.repositories;

import artistry.models.InspectAndAdapt;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectAndAdaptRepository extends Neo4jRepository<InspectAndAdapt, Long> {
}
