package artistry.repositories;

import java.util.Set;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.MajorCity;

@RepositoryRestResource(collectionResourceRel = "geo", path = "MajorCity")
public interface MajorCityRepository extends Neo4jRepository<MajorCity, Long> {

	@Query("MATCH(poi:MajorCity) WHERE poi.asciiName =~ {0} RETURN poi")
	Set<MajorCity> getFuzzyByAsciiName(String asciiname);
}
