package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity("Program")
public class Program extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_BUSINESS_OWNER", direction = Relationship.OUTGOING)
	private Set<Person> businessOwners;

	@Relationship(type = "HAS_KEY_CUSTOMER", direction = Relationship.OUTGOING)
	private Set<Person> keyCustomers;

	@Relationship(type = "HAS_SUCCESS_MEASURE", direction = Relationship.OUTGOING)
	private Set<String> successMeasures;

	private Set<PrincipalRole> principalRoles;

	@Relationship(type = "HAS_OTHER_STAKEHOLDER", direction = Relationship.OUTGOING)
	private Set<Person> otherStakeholders;

	@Relationship(type = "HAS_VALUESTREAM", direction = Relationship.OUTGOING)
	private ValueStream valueStream;

	@Relationship(type = "HAS_PRODUCT_TEAM", direction = Relationship.OUTGOING)
	private Set<Person> productManagement;

	@Relationship(type = "HAS_STE", direction = Relationship.OUTGOING)
	private Person SystemArchitect;

	@Relationship(type = "HAS_RTE", direction = Relationship.OUTGOING)
	private Person releaseTrainEngineer;

	private Set<SystemDemo> systemDemo;
	private Set<InspectAndAdapt> inspectAndAdaptWorkshops;

	// private Set<Feature> features;

	private Set<Epic> programEpics;
	private ProgramBacklog programBacklog;
	private ProgramKanban programKanban;
	// private Set<Objective> piObjectives;
	private Set<Document> architecturalRunway;
	private String programName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Person> getProductManagement() {
		return productManagement;
	}

	public void setProductManagement(Set<Person> productManagement) {
		this.productManagement = productManagement;
	}

	public Person getSystemArchitect() {
		return SystemArchitect;
	}

	public void setSystemArchitect(Person systemArchitect) {
		SystemArchitect = systemArchitect;
	}

	public Person getReleaseTrainEngineer() {
		return releaseTrainEngineer;
	}

	public void setReleaseTrainEngineer(Person releaseTrainEngineer) {
		this.releaseTrainEngineer = releaseTrainEngineer;
	}

	public Set<Person> getBusinessOwners() {
		return businessOwners;
	}

	public void setBusinessOwners(Set<Person> businessOwners) {
		this.businessOwners = businessOwners;
	}

	public Set<SystemDemo> getSystemDemo() {
		return systemDemo;
	}

	public void setSystemDemo(Set<SystemDemo> systemDemo) {
		this.systemDemo = systemDemo;
	}

	public Set<InspectAndAdapt> getInspectAndAdaptWorkshops() {
		return inspectAndAdaptWorkshops;
	}

	public void setInspectAndAdaptWorkshops(Set<InspectAndAdapt> inspectAndAdaptWorkshops) {
		this.inspectAndAdaptWorkshops = inspectAndAdaptWorkshops;
	}

	public Set<Epic> getProgramEpics() {
		return programEpics;
	}

	public void setProgramEpics(Set<Epic> programEpics) {
		this.programEpics = programEpics;
	}

	public ProgramBacklog getProgramBacklog() {
		return programBacklog;
	}

	public void setProgramBacklog(ProgramBacklog programBacklog) {
		this.programBacklog = programBacklog;
	}

	public ProgramKanban getProgramKanban() {
		return programKanban;
	}

	public void setProgramKanban(ProgramKanban programKanban) {
		this.programKanban = programKanban;
	}

	public Set<Document> getArchitecturalRunway() {
		return architecturalRunway;
	}

	public void setArchitecturalRunway(Set<Document> architecturalRunway) {
		this.architecturalRunway = architecturalRunway;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Set<PrincipalRole> getPrincipalRoles() {
		return principalRoles;
	}

	public void setPrincipalRoles(Set<PrincipalRole> principalRoles) {
		this.principalRoles = principalRoles;
	}

}