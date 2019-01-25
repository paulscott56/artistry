package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.Address;

@RepositoryRestResource(collectionResourceRel = "person", path = "address")
public interface AddressRepository extends Neo4jRepository<Address, Long> {

}
