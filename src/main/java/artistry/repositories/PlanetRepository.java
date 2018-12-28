package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.geonames.Planet;

@RepositoryRestResource(collectionResourceRel = "geo", path = "planet")
public interface PlanetRepository extends Neo4jRepository<Planet, Long> {

	Planet findByName(String name);

}
