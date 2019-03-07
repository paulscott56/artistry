package artistry.repositories;

import artistry.enums.Role;
import artistry.models.PrincipalRole;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrincipalRoleRepository extends Neo4jRepository<PrincipalRole, Long> {
    Optional<PrincipalRole> findByRole(Role role);

}
