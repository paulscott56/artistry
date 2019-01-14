package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.person.EmailAddress;

@RepositoryRestResource(collectionResourceRel = "person", path = "emailaddress")
public interface EmailAddressRepository extends Neo4jRepository<EmailAddress, Long> {

}
