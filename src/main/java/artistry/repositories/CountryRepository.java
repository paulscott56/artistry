package artistry.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Country;

//@RepositoryRestResource(collectionResourceRel = "geo", path = "country")
@Repository
public interface CountryRepository extends Neo4jRepository<Country, Long> {

	Country findOneByIso(String countryCode);

	Country findOneByCountry(String countryCode);

	@Query("MATCH(c:Country) WHERE c.country =~ {0} RETURN c")
	Country findByCountry(String countryName);

}
