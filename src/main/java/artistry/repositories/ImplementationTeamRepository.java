/**
 * 
 */
package artistry.repositories;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import artistry.models.ImplementationTeam;

/**
 * @author paul
 *
 */
//@RepositoryRestResource(collectionResourceRel = "org", path = "implementationteam")
@Repository
public interface ImplementationTeamRepository extends Neo4jRepository<ImplementationTeam, Long> {

	Optional<ImplementationTeam> findByTeamName(String name);

}
