package artistry.models.train;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.models.person.Person;
import artistry.models.person.Team;

@NodeEntity
public class Program {
	
	@Id
	@GeneratedValue
	private Long id;

	private List<Team> teams;
	private ProgramIncrement pi;
	private List<Person> productManagement;
	private Person SystemArchitect;
	private Person releaseTrainEngineer;
	private List<Person> businessOwners;
	private List<SystemDemo> systemDemo;
	private List<InspectAndAdapt> inspectAndAdaptWorkshops;
	
	private List<Feature> features;
	private List<Epic> programEpics;
	private ProgramBacklog programBacklog;
	private ProgramKanban programKanban;
	private List<Objective> piObjectives;
	private List<Document> architecturalRunway;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public ProgramIncrement getPi() {
		return pi;
	}
	public void setPi(ProgramIncrement pi) {
		this.pi = pi;
	}
	public List<Person> getProductManagement() {
		return productManagement;
	}
	public void setProductManagement(List<Person> productManagement) {
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
	public List<Person> getBusinessOwners() {
		return businessOwners;
	}
	public void setBusinessOwners(List<Person> businessOwners) {
		this.businessOwners = businessOwners;
	}
	public List<SystemDemo> getSystemDemo() {
		return systemDemo;
	}
	public void setSystemDemo(List<SystemDemo> systemDemo) {
		this.systemDemo = systemDemo;
	}
	public List<InspectAndAdapt> getInspectAndAdaptWorkshops() {
		return inspectAndAdaptWorkshops;
	}
	public void setInspectAndAdaptWorkshops(List<InspectAndAdapt> inspectAndAdaptWorkshops) {
		this.inspectAndAdaptWorkshops = inspectAndAdaptWorkshops;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	public List<Epic> getProgramEpics() {
		return programEpics;
	}
	public void setProgramEpics(List<Epic> programEpics) {
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
	public List<Objective> getPiObjectives() {
		return piObjectives;
	}
	public void setPiObjectives(List<Objective> piObjectives) {
		this.piObjectives = piObjectives;
	}
	public List<Document> getArchitecturalRunway() {
		return architecturalRunway;
	}
	public void setArchitecturalRunway(List<Document> architecturalRunway) {
		this.architecturalRunway = architecturalRunway;
	}
}