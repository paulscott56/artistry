package artistry.models;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Program {
	
	@Id
	@GeneratedValue
	private Long id;

	// list of teams on the program train
	private Set<ImplementationTeam> teams;
	
	private ProgramIncrement pi;
	private Set<Person> productManagement;
	private Person SystemArchitect;
	private Person releaseTrainEngineer;
	private Set<Person> businessOwners;
	private Set<SystemDemo> systemDemo;
	private Set<InspectAndAdapt> inspectAndAdaptWorkshops;
	
	private Set<Feature> features;
	private Set<Epic> programEpics;
	private ProgramBacklog programBacklog;
	private ProgramKanban programKanban;
	private Set<Objective> piObjectives;
	private Set<Document> architecturalRunway;
	private String programName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<ImplementationTeam> getTeams() {
		return teams;
	}
	public void setTeams(Set<ImplementationTeam> teams) {
		this.teams = teams;
	}
	public ProgramIncrement getPi() {
		return pi;
	}
	public void setPi(ProgramIncrement pi) {
		this.pi = pi;
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
	public Set<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(Set<Feature> features) {
		this.features = features;
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
	public Set<Objective> getPiObjectives() {
		return piObjectives;
	}
	public void setPiObjectives(Set<Objective> piObjectives) {
		this.piObjectives = piObjectives;
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
	
	
}