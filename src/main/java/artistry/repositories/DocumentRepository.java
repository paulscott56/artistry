package artistry.repositories;

import artistry.models.Document;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "document", path = "docs")
@Repository
public interface DocumentRepository extends Neo4jRepository<Document, Long> {

}
