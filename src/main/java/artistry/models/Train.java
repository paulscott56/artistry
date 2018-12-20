package artistry.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Train {

	@Id
	private Long id;

	private String name;

	private String visionStatement;

	private String solutionStatement;

	private List<Person> businessOwners;

	private List<Person> keyCustomers;

	private List<String> successMeasures;

	private List<Team> peopleAndLocations;

	private PrincipalRoles principalRoles;

	private String teamDesignStrategy;

	private List<Person> otherStakeholders;

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
