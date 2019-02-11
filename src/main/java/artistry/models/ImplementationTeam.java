package artistry.models;

import java.net.URL;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class ImplementationTeam extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String teamName;
	private EmailAddress teamEmail;
	private Company company;
	private URL teamLogo;

	@Relationship(type = "HAS_PRODUCT_OWNER", direction = Relationship.OUTGOING)
	private Person productOwner;

	@Relationship(type = "HAS_AGILE_TEAM_MEMBER", direction = Relationship.OUTGOING)
	private Set<Person> agileTeam;

	@Relationship(type = "HAS_DEV_TEAM_MEMBER", direction = Relationship.OUTGOING)
	private Set<Person> devTeam;

	@Relationship(type = "HAS_SCRUM_MASTER", direction = Relationship.OUTGOING)
	private Person scrumMaster;

	@Relationship(type = "HAS_PLANNING_DOCUMENT", direction = Relationship.OUTGOING)
	private Set<Document> iterationPlanningDocuments;

	@Relationship(type = "HAS_ITERATION_REVIEW", direction = Relationship.OUTGOING)
	private Set<IterationReview> iterationReviews;

	@Relationship(type = "HAS_ITERATION_RETRO", direction = Relationship.OUTGOING)
	private Set<IterationRetrospective> iterationRetrospectives;

	@Relationship(type = "HAS_INNOVATION_DOCUMENT", direction = Relationship.OUTGOING)
	private Set<Document> innovationAndPlanningDocuments;

	@Relationship(type = "HAS_BOARD", direction = Relationship.OUTGOING)
	private BoardEntry board;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public EmailAddress getTeamEmail() {
		return teamEmail;
	}

	public void setTeamEmail(EmailAddress teamEmail) {
		this.teamEmail = teamEmail;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public URL getTeamLogo() {
		return teamLogo;
	}

	public void setTeamLogo(URL teamLogo) {
		this.teamLogo = teamLogo;
	}

	public Person getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Person productOwner) {
		this.productOwner = productOwner;
	}

	public Set<Person> getAgileTeam() {
		return agileTeam;
	}

	public void setAgileTeam(Set<Person> agileTeam) {
		this.agileTeam = agileTeam;
	}

	public Set<Person> getDevTeam() {
		return devTeam;
	}

	public void setDevTeam(Set<Person> devTeam) {
		this.devTeam = devTeam;
	}

	public Person getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Person scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public Set<Document> getIterationPlanningDocuments() {
		return iterationPlanningDocuments;
	}

	public void setIterationPlanningDocuments(Set<Document> iterationPlanningDocuments) {
		this.iterationPlanningDocuments = iterationPlanningDocuments;
	}

	public Set<IterationReview> getIterationReviews() {
		return iterationReviews;
	}

	public void setIterationReviews(Set<IterationReview> iterationReviews) {
		this.iterationReviews = iterationReviews;
	}

	public Set<IterationRetrospective> getIterationRetrospectives() {
		return iterationRetrospectives;
	}

	public void setIterationRetrospectives(Set<IterationRetrospective> iterationRetrospectives) {
		this.iterationRetrospectives = iterationRetrospectives;
	}

	public Set<Document> getInnovationAndPlanningDocuments() {
		return innovationAndPlanningDocuments;
	}

	public void setInnovationAndPlanningDocuments(Set<Document> innovationAndPlanningDocuments) {
		this.innovationAndPlanningDocuments = innovationAndPlanningDocuments;
	}

	public BoardEntry getBoard() {
		return board;
	}

	public void setBoard(BoardEntry board) {
		this.board = board;
	}

}
