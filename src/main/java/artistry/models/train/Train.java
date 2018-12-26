package artistry.models.train;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;
import artistry.models.person.Team;

@NodeEntity
public class Train {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String visionStatement;

	private String solutionStatement;

	@Relationship(type = "IS_BUSINESS_OWNER", direction = Relationship.INCOMING)
	private List<Person> businessOwners;

	@Relationship(type = "IS_KEY_CUSTOMER", direction = Relationship.INCOMING)
	private List<Person> keyCustomers;

	@Relationship(type = "IS_SUCCESS_MEASURE", direction = Relationship.INCOMING)
	private List<String> successMeasures;

	@Relationship(type = "IS_TEAM", direction = Relationship.INCOMING)
	private List<Team> peopleAndLocations;

	private PrincipalRoles principalRoles;

	private String teamDesignStrategy;

	@Relationship(type = "IS_OTHER_STAKEHOLDER", direction = Relationship.INCOMING)
	private List<Person> otherStakeholders;

	@Relationship(type = "IS_VALUESTREAM_OF", direction = Relationship.OUTGOING)
	private ValueStream valueStream;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVisionStatement() {
		return visionStatement;
	}

	public void setVisionStatement(String visionStatement) {
		this.visionStatement = visionStatement;
	}

	public String getSolutionStatement() {
		return solutionStatement;
	}

	public void setSolutionStatement(String solutionStatement) {
		this.solutionStatement = solutionStatement;
	}

	public List<Person> getBusinessOwners() {
		return businessOwners;
	}

	public void setBusinessOwners(List<Person> businessOwners) {
		this.businessOwners = businessOwners;
	}

	public List<Person> getKeyCustomers() {
		return keyCustomers;
	}

	public void setKeyCustomers(List<Person> keyCustomers) {
		this.keyCustomers = keyCustomers;
	}

	public List<String> getSuccessMeasures() {
		return successMeasures;
	}

	public void setSuccessMeasures(List<String> successMeasures) {
		this.successMeasures = successMeasures;
	}

	public List<Team> getPeopleAndLocations() {
		return peopleAndLocations;
	}

	public void setPeopleAndLocations(List<Team> peopleAndLocations) {
		this.peopleAndLocations = peopleAndLocations;
	}

	public PrincipalRoles getPrincipalRoles() {
		return principalRoles;
	}

	public void setPrincipalRoles(PrincipalRoles principalRoles) {
		this.principalRoles = principalRoles;
	}

	public String getTeamDesignStrategy() {
		return teamDesignStrategy;
	}

	public void setTeamDesignStrategy(String teamDesignStrategy) {
		this.teamDesignStrategy = teamDesignStrategy;
	}

	public List<Person> getOtherStakeholders() {
		return otherStakeholders;
	}

	public void setOtherStakeholders(List<Person> otherStakeholders) {
		this.otherStakeholders = otherStakeholders;
	}

	public ValueStream getValueStream() {
		return valueStream;
	}

	public void setValueStream(ValueStream valueStream) {
		this.valueStream = valueStream;
	}

}
