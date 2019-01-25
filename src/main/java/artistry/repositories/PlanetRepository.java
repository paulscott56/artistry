package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.Planet;

//@RepositoryRestResource(collectionResourceRel = "geo", path = "planet")
@Repository
public interface PlanetRepository extends Neo4jRepository<Planet, Long> {

	Planet findByName(String name);

}
