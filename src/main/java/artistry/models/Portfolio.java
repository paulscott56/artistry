package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Portfolio level model
 * 
 * @author paul
 * @see https://www.scaledagileframework.com/portfolio-level/
 *
 */
@NodeEntity
public class Portfolio extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_EPIC_OWNERS", direction = Relationship.OUTGOING)
	private Set<Person> epicOwners;

	@Relationship(type = "HAS_ENTERPRISE_ARCHITECT", direction = Relationship.OUTGOING)
	private Person enterpriseArchitect;

	private String portfolioName;

	@Relationship(type = "HAS_MANAGEMENT_TEAM", direction = Relationship.OUTGOING)
	private Set<Person> portfolioManagementTeam;

	@Relationship(type = "HAS_VALUE_STREAM", direction = Relationship.OUTGOING)
	private Set<ValueStream> valueStreams;

	@Relationship(type = "HAS_STRATEGIC_THEME", direction = Relationship.OUTGOING)
	private Set<StrategicTheme> strategicThemes;

	@Relationship(type = "HAS_PORTFOLIO_CANVAS", direction = Relationship.OUTGOING)
	private PortfolioCanvas portfolioCanvas;

	// need to model something for lean budget
	// this will probably change from a document type to something more solid
	private Document leanBudget;

	@Relationship(type = "HAS_BACKLOG_FEATURE", direction = Relationship.OUTGOING)
	private Set<Feature> portfolioBacklog;

	@Relationship(type = "HAS_BUSINESS_EPIC", direction = Relationship.OUTGOING)
	private Set<Epic> businessEpics;

	@Relationship(type = "HAS_ENABLER_EPIC", direction = Relationship.OUTGOING)
	private Set<Epic> enablerEpics;

	// we can either go to large solution or program level here, depending on size
	// of portfolio
	@Relationship(type = "HAS_LARGE_SOLUTION", direction = Relationship.OUTGOING)
	private Set<LargeSolution> largeSolutions;

	@Relationship(type = "HAS_PROGRAM", direction = Relationship.OUTGOING)
	private Set<Program> programs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Person> getEpicOwners() {
		return epicOwners;
	}

	public void setEpicOwners(Set<Person> epicOwners) {
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

	public Set<Person> getPortfolioManagementTeam() {
		return portfolioManagementTeam;
	}

	public void setPortfolioManagementTeam(Set<Person> portfolioManagementTeam) {
		this.portfolioManagementTeam = portfolioManagementTeam;
	}

	public Set<ValueStream> getValueStreams() {
		return valueStreams;
	}

	public void setValueStreams(Set<ValueStream> valueStreams) {
		this.valueStreams = valueStreams;
	}

	public Set<StrategicTheme> getStrategicThemes() {
		return strategicThemes;
	}

	public void setStrategicThemes(Set<StrategicTheme> strategicThemes) {
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

	public Set<Feature> getPortfolioBacklog() {
		return portfolioBacklog;
	}

	public void setPortfolioBacklog(Set<Feature> portfolioBacklog) {
		this.portfolioBacklog = portfolioBacklog;
	}

	public Set<Epic> getBusinessEpics() {
		return businessEpics;
	}

	public void setBusinessEpics(Set<Epic> businessEpics) {
		this.businessEpics = businessEpics;
	}

	public Set<Epic> getEnablerEpics() {
		return enablerEpics;
	}

	public void setEnablerEpics(Set<Epic> enablerEpics) {
		this.enablerEpics = enablerEpics;
	}

	public Set<LargeSolution> getLargeSolutions() {
		return largeSolutions;
	}

	public void setLargeSolutions(Set<LargeSolution> largeSolutions) {
		this.largeSolutions = largeSolutions;
	}

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}

}
