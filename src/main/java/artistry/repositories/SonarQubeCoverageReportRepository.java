package artistry.repositories;

import artistry.models.SonarQubeCoverageReport;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SonarQubeCoverageReportRepository extends Neo4jRepository<SonarQubeCoverageReport, Long> {

}
