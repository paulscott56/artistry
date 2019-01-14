/**
 * 
 */
package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.person.ImplementationTeam;

/**
 * @author paul
 *
 */
@RepositoryRestResource(collectionResourceRel = "team", path = "implementationteam")
public interface ImplementationTeamRepository extends Neo4jRepository<ImplementationTeam, Long> {

}
