package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.geonames.GeoPlace;

@RepositoryRestResource(collectionResourceRel = "geo", path = "geo")
public interface GeoRepository extends Neo4jRepository<GeoPlace, Long> {

}