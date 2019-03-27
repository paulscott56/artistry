package artistry.repositories;

import artistry.models.Planet;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "geo", path = "planet")
@Repository
public interface PlanetRepository extends Neo4jRepository<Planet, Long> {

	Planet findByName(String name);

}
