/**
 * 
 */
package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.person.ImplementationTeam;

/**
 * @author paul
 *
 */
@RepositoryRestResource(collectionResourceRel = "org", path = "implementationteam")
public interface ImplementationTeamRepository extends Neo4jRepository<ImplementationTeam, Long> {

	Optional<ImplementationTeam> findByTeamName(String name);

}
