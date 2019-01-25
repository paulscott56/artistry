package artistry.models;

import java.io.Serializable;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Train implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String visionStatement;

	private String solutionStatement;

	@Relationship(type = "IS_BUSINESS_OWNER", direction = Relationship.INCOMING)
	private Set<Person> businessOwners;

	@Relationship(type = "IS_KEY_CUSTOMER", direction = Relationship.INCOMING)
	private Set<Person> keyCustomers;

	@Relationship(type = "IS_SUCCESS_MEASURE", direction = Relationship.INCOMING)
	private Set<String> successMeasures;

	@Relationship(type = "IS_TEAM", direction = Relationship.INCOMING)
	private Set<ImplementationTeam> peopleAndLocations;

	private PrincipalRoles principalRoles;

	private String teamDesignStrategy;

	@Relationship(type = "IS_OTHER_STAKEHOLDER", direction = Relationship.INCOMING)
	private Set<Person> otherStakeholders;

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

	public Set<Person> getBusinessOwners() {
		return businessOwners;
	}

	public void setBusinessOwners(Set<Person> businessOwners) {
		this.businessOwners = businessOwners;
	}

	public Set<Person> getKeyCustomers() {
		return keyCustomers;
	}

	public void setKeyCustomers(Set<Person> keyCustomers) {
		this.keyCustomers = keyCustomers;
	}

	public Set<String> getSuccessMeasures() {
		return successMeasures;
	}

	public void setSuccessMeasures(Set<String> successMeasures) {
		this.successMeasures = successMeasures;
	}

	public Set<ImplementationTeam> getPeopleAndLocations() {
		return peopleAndLocations;
	}

	public void setPeopleAndLocations(Set<ImplementationTeam> peopleAndLocations) {
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

	public Set<Person> getOtherStakeholders() {
		return otherStakeholders;
	}

	public void setOtherStakeholders(Set<Person> otherStakeholders) {
		this.otherStakeholders = otherStakeholders;
	}

	public ValueStream getValueStream() {
		return valueStream;
	}

	public void setValueStream(ValueStream valueStream) {
		this.valueStream = valueStream;
	}

	
}
