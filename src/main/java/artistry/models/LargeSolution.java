package artistry.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class LargeSolution {

	@Id
	@GeneratedValue
	private Long id;
	
	private String largeSolutionName;

	@Relationship(type = "HAS_SOLUTION_ARCHITECT", direction = Relationship.OUTGOING)
	private Person solutionArchitect;

	@Relationship(type = "HAS_SOLUTION_MANAGER", direction = Relationship.OUTGOING)
	private Set<Person> solutionManagement;

	@Relationship(type = "HAS_SOLUTION_TRAIN_ENGINEER", direction = Relationship.OUTGOING)
	private Person solutionTrainEngineer;
	
	@Relationship(type = "HAS_TRAIN", direction = Relationship.OUTGOING)
	private Set<Train> trains;
	
	private Document solutionIntent;
	
	@Relationship(type = "HAS_CUSTOMER", direction = Relationship.OUTGOING)
	private Person customer;
	
	private Document solutionContext;
	
	@Relationship(type = "HAS_CAPABILITY", direction = Relationship.OUTGOING)
	private Set<Capability> capabilities;
	
	@Relationship(type = "HAS_SOLUTION_EPIC", direction = Relationship.OUTGOING)
	private Set<Epic> solutionEpics;
	
	@Relationship(type = "HAS_NFR", direction = Relationship.OUTGOING)
	private Set<NonFunctionalRequirement> nonFunctionalRequirements;
	
	// solution kanban model ...
	private SolutionBacklog solutionBacklog;
	
	@Relationship(type = "HAS_PROGRAM", direction = Relationship.OUTGOING)
	private Set<Program> programs;
	
	
	@Relationship(type = "HAS_DOCUMENT", direction = Relationship.OUTGOING)
	private Set<Document> prePlanningDocuments;
	@Relationship(type = "HAS_DOCUMENT", direction = Relationship.OUTGOING)
	private Set<Document> postPlanningDocuments;
	
	private Date solutionDemo;
	
	@Relationship(type = "HAS_INSPECT_AND_ADAPT", direction = Relationship.OUTGOING)
	private InspectAndAdapt inspectAndAdaptEvent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getSolutionArchitect() {
		return solutionArchitect;
	}

	public void setSolutionArchitect(Person solutionArchitect) {
		this.solutionArchitect = solutionArchitect;
	}

	public Set<Person> getSolutionManagement() {
		return solutionManagement;
	}

	public void setSolutionManagement(Set<Person> solutionManagement) {
		this.solutionManagement = solutionManagement;
	}

	public Person getSolutionTrainEngineer() {
		return solutionTrainEngineer;
	}

	public void setSolutionTrainEngineer(Person solutionTrainEngineer) {
		this.solutionTrainEngineer = solutionTrainEngineer;
	}

	public Set<Train> getTrains() {
		return trains;
	}

	public void setTrains(Set<Train> trains) {
		this.trains = trains;
	}

	public Document getSolutionIntent() {
		return solutionIntent;
	}

	public void setSolutionIntent(Document solutionIntent) {
		this.solutionIntent = solutionIntent;
	}

	public Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public Document getSolutionContext() {
		return solutionContext;
	}

	public void setSolutionContext(Document solutionContext) {
		this.solutionContext = solutionContext;
	}

	public Set<Capability> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Set<Capability> capabilities) {
		this.capabilities = capabilities;
	}

	public Set<Epic> getSolutionEpics() {
		return solutionEpics;
	}

	public void setSolutionEpics(Set<Epic> solutionEpics) {
		this.solutionEpics = solutionEpics;
	}

	public Set<NonFunctionalRequirement> getNonFunctionalRequirements() {
		return nonFunctionalRequirements;
	}

	public void setNonFunctionalRequirements(Set<NonFunctionalRequirement> nonFunctionalRequirements) {
		this.nonFunctionalRequirements = nonFunctionalRequirements;
	}

	public SolutionBacklog getSolutionBacklog() {
		return solutionBacklog;
	}

	public void setSolutionBacklog(SolutionBacklog solutionBacklog) {
		this.solutionBacklog = solutionBacklog;
	}

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}

	public Set<Document> getPrePlanningDocuments() {
		return prePlanningDocuments;
	}

	public void setPrePlanningDocuments(Set<Document> prePlanningDocuments) {
		this.prePlanningDocuments = prePlanningDocuments;
	}

	public Set<Document> getPostPlanningDocuments() {
		return postPlanningDocuments;
	}

	public void setPostPlanningDocuments(Set<Document> postPlanningDocuments) {
		this.postPlanningDocuments = postPlanningDocuments;
	}

	public Date getSolutionDemo() {
		return solutionDemo;
	}

	public void setSolutionDemo(Date solutionDemo) {
		this.solutionDemo = solutionDemo;
	}

	public InspectAndAdapt getInspectAndAdaptEvent() {
		return inspectAndAdaptEvent;
	}

	public void setInspectAndAdaptEvent(InspectAndAdapt inspectAndAdaptEvent) {
		this.inspectAndAdaptEvent = inspectAndAdaptEvent;
	}

	public String getLargeSolutionName() {
		return largeSolutionName;
	}

	public void setLargeSolutionName(String largeSolutionName) {
		this.largeSolutionName = largeSolutionName;
	}

	
	
}