package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.EmailAddress;
import artistry.models.Person;

//@RepositoryRestResource(collectionResourceRel = "people", path = "person")
@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByEmailAddress(EmailAddress email);

	Person findByUsername(String username);

}
