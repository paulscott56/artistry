package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class DevelopmentValueStream {

    @Id
    @GeneratedValue
    private Long id;

	private String valueStreamName;
	//private OperationalValueStream operationalValueStream;
	private Document valueProposition;
	//private Set<Solution> solutions;
	//private Set<CustomerSegment> customerSegments;
	private Document budget;
	//private SolutionContext solutionContext;
	//private Set<Channel> channels;
	//private Set<KPI> kpis;
	//private Revenue revenueStatement;
	private Set<Person> people;
	//private Set<Country> locations;
	private Set<Document> customerRelationships;
	private Document economicFramework;
	//private Set<Train> trains;
	//private Set<Supplier> suppliers;
	private Person solutionTrainEngineer;
	private Set<Person> solutionManagement;
	private Person solutionArchitect;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValueStreamName() {
		return valueStreamName;
	}

	public void setValueStreamName(String valueStreamName) {
		this.valueStreamName = valueStreamName;
	}

	public Document getValueProposition() {
		return valueProposition;
	}

	public void setValueProposition(Document valueProposition) {
		this.valueProposition = valueProposition;
	}

	public Document getBudget() {
		return budget;
	}

	public void setBudget(Document budget) {
		this.budget = budget;
	}

	public Set<Person> getPeople() {
		return people;
	}

	public void setPeople(Set<Person> people) {
		this.people = people;
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
