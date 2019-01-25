package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.Continent;

@RepositoryRestResource(collectionResourceRel = "geo", path = "continent")
public interface ContinentRepository extends Neo4jRepository<Continent, Long> {

	Continent findByName(String name);

	Continent findByCode(String code);

	Continent findOneByCode(String continent);

}
