package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.PhoneNumber;

@RepositoryRestResource(collectionResourceRel = "person", path = "phonenumber")
public interface PhoneNumberRepository extends Neo4jRepository<PhoneNumber, Long> {

}
