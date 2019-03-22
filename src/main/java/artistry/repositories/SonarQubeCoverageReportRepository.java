package artistry.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import artistry.models.SonarQubeCoverageReport;

@Repository
public interface SonarQubeCoverageReportRepository extends Neo4jRepository<SonarQubeCoverageReport, Long> {

}
