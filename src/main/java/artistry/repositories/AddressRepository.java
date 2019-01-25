package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.Address;

//@RepositoryRestResource(collectionResourceRel = "person", path = "address")
@Repository
public interface AddressRepository extends Neo4jRepository<Address, Long> {

}
