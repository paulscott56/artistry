package artistry.repositories;

import artistry.models.Epic;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "portfolio", path = "epic")
@Repository
public interface EpicRepository extends Neo4jRepository<Epic, Long> {

}
