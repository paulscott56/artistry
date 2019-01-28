package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.Address;

@Repository
public interface AddressRepository extends Neo4jRepository<Address, Long> {

}