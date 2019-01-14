package artistry.models.person;

import java.net.URL;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.train.Document;
import artistry.models.train.EnablerStory;
import artistry.models.train.IterationGoal;
import artistry.models.train.IterationRetrospective;
import artistry.models.train.IterationReview;
import artistry.models.train.Objective;
import artistry.models.train.Story;
import artistry.models.train.TeamBacklog;

@NodeEntity
public class ImplementationTeam {

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
	private List<Person> agileTeam;
	@Relationship(type = "HAS_DEV_TEAM_MEMBER", direction = Relationship.OUTGOING)
	private List<Person> devTeam;
	@Relationship(type = "HAS_SCRUM_MASTER", direction = Relationship.OUTGOING)
	private Person scrumMaster;
	
	@Relationship(type = "HAS_PLANNING_DOCUMENT", direction = Relationship.OUTGOING)
	private List<Document> iterationPlanningDocuments;
	
	@Relationship(type = "HAS_ITERATION_REVIEW", direction = Relationship.OUTGOING)
	private List<IterationReview> iterationReviews;
	
	@Relationship(type = "HAS_ITERATION_RETRO", direction = Relationship.OUTGOING)
	private List<IterationRetrospective> iterationRetrospectives;
	
	@Relationship(type = "HAS_INNOVATION_DOCUMENT", direction = Relationship.OUTGOING)
	private List<Document> innovationAndPlanningDocuments;

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

	public List<Person> getAgileTeam() {
		return agileTeam;
	}

	public void setAgileTeam(List<Person> agileTeam) {
		this.agileTeam = agileTeam;
	}

	public List<Person> getDevTeam() {
		return devTeam;
	}

	public void setDevTeam(List<Person> devTeam) {
		this.devTeam = devTeam;
	}

	public Person getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Person scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public List<Document> getIterationPlanningDocuments() {
		return iterationPlanningDocuments;
	}

	public void setIterationPlanningDocuments(List<Document> iterationPlanningDocuments) {
		this.iterationPlanningDocuments = iterationPlanningDocuments;
	}

	public List<IterationReview> getIterationReviews() {
		return iterationReviews;
	}

	public void setIterationReviews(List<IterationReview> iterationReviews) {
		this.iterationReviews = iterationReviews;
	}

	public List<IterationRetrospective> getIterationRetrospectives() {
		return iterationRetrospectives;
	}

	public void setIterationRetrospectives(List<IterationRetrospective> iterationRetrospectives) {
		this.iterationRetrospectives = iterationRetrospectives;
	}

	public List<Document> getInnovationAndPlanningDocuments() {
		return innovationAndPlanningDocuments;
	}

	public void setInnovationAndPlanningDocuments(List<Document> innovationAndPlanningDocuments) {
		this.innovationAndPlanningDocuments = innovationAndPlanningDocuments;
	}
	
//	@Relationship(type = "HAS_STORY", direction = Relationship.OUTGOING)
//	private List<Story> stories;
//	
//	@Relationship(type = "HAS_ENABLER_STORY", direction = Relationship.OUTGOING)
//	private List<EnablerStory> enablerStories;
//	
//	@Relationship(type = "HAS_ITERATION_GOAL", direction = Relationship.OUTGOING)
//	private List<IterationGoal> iterationGoals;
//	@Relationship(type = "HAS_BACKLOG", direction = Relationship.OUTGOING)
//	private TeamBacklog teamBacklog;
//	@Relationship(type = "HAS_PI_OBJECTIVE", direction = Relationship.OUTGOING)
//	private List<Objective> teamPiObjectives;

	
}
