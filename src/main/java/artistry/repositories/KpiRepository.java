package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.KPI;

@RepositoryRestResource(collectionResourceRel = "enterprise", path = "kpi")
public interface KpiRepository extends Neo4jRepository<KPI, Long> {

}
