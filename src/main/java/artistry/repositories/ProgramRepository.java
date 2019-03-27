package artistry.repositories;

import artistry.models.Program;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "org", path = "program")
@Repository
public interface ProgramRepository extends Neo4jRepository<Program, Long> {

	Iterable<Program> findByProgramName(String name);

}
