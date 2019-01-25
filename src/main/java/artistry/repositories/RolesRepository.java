package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.enums.Role;
import artistry.models.PersonRole;

//@RepositoryRestResource(collectionResourceRel = "person", path = "role")
@Repository
public interface RolesRepository extends Neo4jRepository<PersonRole, Long> {

	Optional<PersonRole> findByRoleName(String roleName);
	Optional<PersonRole> findByRole(Role role);

}