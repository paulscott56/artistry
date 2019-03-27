package artistry.repositories;

import artistry.models.PhoneNumber;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "person", path = "phonenumber")
@Repository
public interface PhoneNumberRepository extends Neo4jRepository<PhoneNumber, Long> {

}
