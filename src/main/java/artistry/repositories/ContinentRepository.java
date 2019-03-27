package artistry.repositories;

import artistry.models.Continent;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "geo", path = "continent")
@Repository
public interface ContinentRepository extends Neo4jRepository<Continent, Long> {

	Continent findByName(String name);

	Continent findByCode(String code);

	Continent findOneByCode(String continent);

}
