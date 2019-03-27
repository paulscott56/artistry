package artistry.repositories;

import artistry.enums.Role;
import artistry.models.PersonRole;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@RepositoryRestResource(collectionResourceRel = "person", path = "role")
@Repository
public interface RolesRepository extends Neo4jRepository<PersonRole, Long> {

	Optional<PersonRole> findByRoleName(String roleName);
	Optional<PersonRole> findByRole(Role role);

}