package artistry.repositories;

import artistry.models.Feature;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "train", path = "feature")
@Repository
public interface FeatureRepository extends Neo4jRepository<Feature, Long> {

}
