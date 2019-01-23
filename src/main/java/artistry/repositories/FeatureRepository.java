package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Feature;

@RepositoryRestResource(collectionResourceRel = "train", path = "feature")
public interface FeatureRepository extends Neo4jRepository<Feature, Long> {

}
