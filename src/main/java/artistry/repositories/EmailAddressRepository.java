package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.EmailAddress;

//@RepositoryRestResource(collectionResourceRel = "person", path = "emailaddress")
@Repository
public interface EmailAddressRepository extends Neo4jRepository<EmailAddress, Long> {

	EmailAddress findByWorkEmail(String emailAddress);

}
