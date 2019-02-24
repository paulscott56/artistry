/**
 * Repository for implementation teams
 */
package artistry.repositories;

import artistry.models.ImplementationTeam;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author paul
 *
 */
//@RepositoryRestResource(collectionResourceRel = "org", path = "implementationteam")
@Repository
public interface ImplementationTeamRepository extends Neo4jRepository<ImplementationTeam, Long> {

	Optional<ImplementationTeam> findByTeamName(String name);

}
