package artistry.repositories;

import artistry.models.EmailAddress;
import artistry.models.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "people", path = "person")
@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByEmailAddress(EmailAddress email);

	Person findByUsername(String username);

}
