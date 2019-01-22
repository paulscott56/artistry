package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.StrategicTheme;

@RepositoryRestResource(collectionResourceRel = "enterprise", path = "strategictheme")
public interface StrategicThemeRepository extends Neo4jRepository<StrategicTheme, Long> {

}
