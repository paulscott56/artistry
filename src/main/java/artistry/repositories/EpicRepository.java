package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Epic;

@RepositoryRestResource(collectionResourceRel = "portfolio", path = "epic")
public interface EpicRepository extends Neo4jRepository<Epic, Long> {

}
