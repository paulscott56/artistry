package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Epic;

//@RepositoryRestResource(collectionResourceRel = "portfolio", path = "epic")
@Repository
public interface EpicRepository extends Neo4jRepository<Epic, Long> {

}
