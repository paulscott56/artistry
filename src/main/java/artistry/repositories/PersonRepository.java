package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.person.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "person")
public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
