package artistry.models.train;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;

@NodeEntity
public class LargeSolution {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_SOLUTION_ARCHITECT", direction = Relationship.OUTGOING)
	private Person solutionArchitect;

	@Relationship(type = "HAS_SOLUTION_MANAGER", direction = Relationship.OUTGOING)
	private List<Person> solutionManagement;

	@Relationship(type = "HAS_SOLUTION_TRAIN_ENGINEER", direction = Relationship.OUTGOING)
	private Person solutionTrainEngineer;
	
	@Relationship(type = "HAS_TRAIN", direction = Relationship.OUTGOING)
	private List<Train> trains;
	
	private Document solutionIntent;
	
	@Relationship(type = "HAS_CUSTOMER", direction = Relationship.OUTGOING)
	private Person customer;
	
	private Document solutionContext;
	
	@Relationship(type = "HAS_CAPABILITY", direction = Relationship.OUTGOING)
	private List<Capability> capabilities;
	
	@Relationship(type = "HAS_SOLUTION_EPIC", direction = Relationship.OUTGOING)
	private List<Epic> solutionEpics;
	
	@Relationship(type = "HAS_NFR", direction = Relationship.OUTGOING)
	private List<NonFunctionalRequirement> nonFunctionalRequirements;
	
	// solution kanban model ...
	private SolutionBacklog solutionBacklog;
	
	@Relationship(type = "HAS_PROGRAM", direction = Relationship.OUTGOING)
	private List<Program> programs;
	
	
	@Relationship(type = "HAS_DOCUMENT", direction = Relationship.OUTGOING)
	private List<Document> prePlanningDocuments;
	@Relationship(type = "HAS_DOCUMENT", direction = Relationship.OUTGOING)
	private List<Document> postPlanningDocuments;
	
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

	public List<Person> getSolutionManagement() {
		return solutionManagement;
	}

	public void setSolutionManagement(List<Person> solutionManagement) {
		this.solutionManagement = solutionManagement;
	}

	public Person getSolutionTrainEngineer() {
		return solutionTrainEngineer;
	}

	public void setSolutionTrainEngineer(Person solutionTrainEngineer) {
		this.solutionTrainEngineer = solutionTrainEngineer;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
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

	public List<Capability> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}

	public List<Epic> getSolutionEpics() {
		return solutionEpics;
	}

	public void setSolutionEpics(List<Epic> solutionEpics) {
		this.solutionEpics = solutionEpics;
	}

	public List<NonFunctionalRequirement> getNonFunctionalRequirements() {
		return nonFunctionalRequirements;
	}

	public void setNonFunctionalRequirements(List<NonFunctionalRequirement> nonFunctionalRequirements) {
		this.nonFunctionalRequirements = nonFunctionalRequirements;
	}

	public SolutionBacklog getSolutionBacklog() {
		return solutionBacklog;
	}

	public void setSolutionBacklog(SolutionBacklog solutionBacklog) {
		this.solutionBacklog = solutionBacklog;
	}

	public List<Document> getPrePlanningDocuments() {
		return prePlanningDocuments;
	}

	public void setPrePlanningDocuments(List<Document> prePlanningDocuments) {
		this.prePlanningDocuments = prePlanningDocuments;
	}

	public List<Document> getPostPlanningDocuments() {
		return postPlanningDocuments;
	}

	public void setPostPlanningDocuments(List<Document> postPlanningDocuments) {
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
	
	
}