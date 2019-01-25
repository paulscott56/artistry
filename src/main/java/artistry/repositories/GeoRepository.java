package artistry.repositories;

import java.util.Set;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Place;

//@RepositoryRestResource(collectionResourceRel = "geo", path = "geo")
@Repository
public interface GeoRepository extends Neo4jRepository<Place, Long> {

	Iterable<Place> findAllByName(String name);

	@Query("MATCH(poi:Place) WHERE poi.asciiName =~ {0} RETURN poi")
	Set<Place> getFuzzyByAsciiName(String asciiname);

}