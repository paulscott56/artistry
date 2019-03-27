package artistry.repositories;

import artistry.models.KPI;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "kpi")
@Repository
public interface KpiRepository extends Neo4jRepository<KPI, Long> {

}
