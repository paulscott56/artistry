package artistry.models.train;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;

@NodeEntity
public class Portfolio {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Relationship(type = "HAS_EPIC_OWNERS", direction = Relationship.OUTGOING)
	private List<Person> epicOwners;
	
	@Relationship(type = "HAS_ENTERPRISE_ARCHITECT", direction = Relationship.OUTGOING)
	private Person enterpriseArchitect;
	
	private String portfolioName;
	
	@Relationship(type = "HAS_MANAGEMENT_TEAM", direction = Relationship.OUTGOING)
	private List<Person> portfolioManagementTeam;
	
	private List<ValueStream> valueStreams;
	
	@Relationship(type = "HAS_STRATEGIC_THEME", direction = Relationship.OUTGOING)
	private List<StrategicTheme> strategicThemes;
	
	@Relationship(type = "HAS_PORTFOLIO_CANVAS", direction = Relationship.OUTGOING)
	private PortfolioCanvas portfolioCanvas;
	
	
	
	
	
	// need to model something for lean budget, as well as portfolio kanban backlog
	
	

}
