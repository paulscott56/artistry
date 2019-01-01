package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.geonames.Place;

@RepositoryRestResource(collectionResourceRel = "geo", path = "geo")
public interface GeoRepository extends Neo4jRepository<Place, Long> {

	Iterable<Place> findAllByName(String name);

}