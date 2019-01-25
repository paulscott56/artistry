package artistry.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.Country;

@RepositoryRestResource(collectionResourceRel = "geo", path = "country")
public interface CountryRepository extends Neo4jRepository<Country, Long> {

	Country findOneByIso(String countryCode);

	Country findOneByCountry(String countryCode);

	@Query("MATCH(c:Country) WHERE c.country =~ {0} RETURN c")
	Country findByCountry(String countryName);

}
