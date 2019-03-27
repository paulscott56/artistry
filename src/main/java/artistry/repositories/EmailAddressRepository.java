package artistry.repositories;

import artistry.models.EmailAddress;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "person", path = "emailaddress")
@Repository
public interface EmailAddressRepository extends Neo4jRepository<EmailAddress, Long> {

	// EmailAddress findByWorkEmail(String emailAddress);

}
