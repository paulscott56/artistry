package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Document;

@RepositoryRestResource(collectionResourceRel = "document", path = "docs")
public interface DocumentRepository extends Neo4jRepository<Document, Long> {

}
