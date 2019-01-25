package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.KPI;

//@RepositoryRestResource(collectionResourceRel = "enterprise", path = "kpi")
@Repository
public interface KpiRepository extends Neo4jRepository<KPI, Long> {

}
