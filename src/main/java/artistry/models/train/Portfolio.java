package artistry.models.train;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;

/**
 * Portfolio level model
 * 
 * @author paul
 * @see https://www.scaledagileframework.com/portfolio-level/
 *
 */
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
	
	// need to model something for lean budget
	// this will probably change from a document type to something more solid
	private Document leanBudget;
	
	private List<Feature> portfolioBacklog;
	
	private List<Epic> businessEpics;
	private List<Epic> enablerEpics;
	
	// we can either go to large solution or program level here, depending on size of portfolio
	private List<LargeSolution> largeSolutions;
	private List<Program> programs;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Person> getEpicOwners() {
		return epicOwners;
	}
	public void setEpicOwners(List<Person> epicOwners) {
		this.epicOwners = epicOwners;
	}
	public Person getEnterpriseArchitect() {
		return enterpriseArchitect;
	}
	public void setEnterpriseArchitect(Person enterpriseArchitect) {
		this.enterpriseArchitect = enterpriseArchitect;
	}
	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public List<Person> getPortfolioManagementTeam() {
		return portfolioManagementTeam;
	}
	public void setPortfolioManagementTeam(List<Person> portfolioManagementTeam) {
		this.portfolioManagementTeam = portfolioManagementTeam;
	}
	public List<ValueStream> getValueStreams() {
		return valueStreams;
	}
	public void setValueStreams(List<ValueStream> valueStreams) {
		this.valueStreams = valueStreams;
	}
	public List<StrategicTheme> getStrategicThemes() {
		return strategicThemes;
	}
	public void setStrategicThemes(List<StrategicTheme> strategicThemes) {
		this.strategicThemes = strategicThemes;
	}
	public PortfolioCanvas getPortfolioCanvas() {
		return portfolioCanvas;
	}
	public void setPortfolioCanvas(PortfolioCanvas portfolioCanvas) {
		this.portfolioCanvas = portfolioCanvas;
	}
	public Document getLeanBudget() {
		return leanBudget;
	}
	public void setLeanBudget(Document leanBudget) {
		this.leanBudget = leanBudget;
	}
	public List<Feature> getPortfolioBacklog() {
		return portfolioBacklog;
	}
	public void setPortfolioBacklog(List<Feature> portfolioBacklog) {
		this.portfolioBacklog = portfolioBacklog;
	}
	public List<Epic> getBusinessEpics() {
		return businessEpics;
	}
	public void setBusinessEpics(List<Epic> businessEpics) {
		this.businessEpics = businessEpics;
	}
	public List<Epic> getEnablerEpics() {
		return enablerEpics;
	}
	public void setEnablerEpics(List<Epic> enablerEpics) {
		this.enablerEpics = enablerEpics;
	}
}
