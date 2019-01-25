package artistry.models;

import java.io.Serializable;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class DevelopmentValueStream implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String valueStreamName;
	private OperationalValueStream operationalValueStream;
	private Document valueProposition;
	private Set<Solution> solutions;
	private Set<CustomerSegment> customerSegments;
	private Document budget;
	private SolutionContext solutionContext;
	private Set<Channel> channels;
	private Set<KPI> kpis;
	private Revenue revenueStatement;
	private Set<Person> people;
	private Set<Country> locations;
	private Set<Document> customerRelationships;
	private Document economicFramework;
	private Set<Train> trains;
	private Set<Supplier> suppliers;
	private Person solutionTrainEngineer;
	private Set<Person> solutionManagement;
	private Person solutionArchitect;
	
	public String getValueStreamName() {
		return valueStreamName;
	}
	public void setValueStreamName(String valueStreamName) {
		this.valueStreamName = valueStreamName;
	}
	public OperationalValueStream getOperationalValueStream() {
		return operationalValueStream;
	}
	public void setOperationalValueStream(OperationalValueStream operationalValueStream) {
		this.operationalValueStream = operationalValueStream;
	}
	public Document getValueProposition() {
		return valueProposition;
	}
	public void setValueProposition(Document valueProposition) {
		this.valueProposition = valueProposition;
	}
	public Set<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(Set<Solution> solutions) {
		this.solutions = solutions;
	}
	public Set<CustomerSegment> getCustomerSegments() {
		return customerSegments;
	}
	public void setCustomerSegments(Set<CustomerSegment> customerSegments) {
		this.customerSegments = customerSegments;
	}
	public Document getBudget() {
		return budget;
	}
	public void setBudget(Document budget) {
		this.budget = budget;
	}
	public SolutionContext getSolutionContext() {
		return solutionContext;
	}
	public void setSolutionContext(SolutionContext solutionContext) {
		this.solutionContext = solutionContext;
	}
	public Set<Channel> getChannels() {
		return channels;
	}
	public void setChannels(Set<Channel> channels) {
		this.channels = channels;
	}
	public Set<KPI> getKpis() {
		return kpis;
	}
	public void setKpis(Set<KPI> kpis) {
		this.kpis = kpis;
	}
	public Revenue getRevenueStatement() {
		return revenueStatement;
	}
	public void setRevenueStatement(Revenue revenueStatement) {
		this.revenueStatement = revenueStatement;
	}
	public Set<Person> getPeople() {
		return people;
	}
	public void setPeople(Set<Person> people) {
		this.people = people;
	}
	public Set<Country> getLocations() {
		return locations;
	}
	public void setLocations(Set<Country> locations) {
		this.locations = locations;
	}
	public Set<Document> getCustomerRelationships() {
		return customerRelationships;
	}
	public void setCustomerRelationships(Set<Document> customerRelationships) {
		this.customerRelationships = customerRelationships;
	}
	public Document getEconomicFramework() {
		return economicFramework;
	}
	public void setEconomicFramework(Document economicFramework) {
		this.economicFramework = economicFramework;
	}
	public Set<Train> getTrains() {
		return trains;
	}
	public void setTrains(Set<Train> trains) {
		this.trains = trains;
	}
	public Set<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	public Person getSolutionTrainEngineer() {
		return solutionTrainEngineer;
	}
	public void setSolutionTrainEngineer(Person solutionTrainEngineer) {
		this.solutionTrainEngineer = solutionTrainEngineer;
	}
	public Set<Person> getSolutionManagement() {
		return solutionManagement;
	}
	public void setSolutionManagement(Set<Person> solutionManagement) {
		this.solutionManagement = solutionManagement;
	}
	public Person getSolutionArchitect() {
		return solutionArchitect;
	}
	public void setSolutionArchitect(Person solutionArchitect) {
		this.solutionArchitect = solutionArchitect;
	}

	
}
