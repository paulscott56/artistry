package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.person.PersonRole;

@RepositoryRestResource(collectionResourceRel = "person", path = "role")
public interface RolesRepository extends Neo4jRepository<PersonRole, Long> {

	Optional<PersonRole> findByRoleName(String roleName);

}