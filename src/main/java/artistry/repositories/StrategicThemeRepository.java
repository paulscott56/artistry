package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.StrategicTheme;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "strategictheme")
@Repository
public interface StrategicThemeRepository extends Neo4jRepository<StrategicTheme, Long> {

}
