package artistry.repositories;

import artistry.models.StrategicTheme;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "strategictheme")
@Repository
public interface StrategicThemeRepository extends Neo4jRepository<StrategicTheme, Long> {

}
