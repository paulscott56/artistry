package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Program;

@RepositoryRestResource(collectionResourceRel = "org", path = "program")
public interface ProgramRepository extends Neo4jRepository<Program, Long> {

	Iterable<Program> findByProgramName(String name);

}
