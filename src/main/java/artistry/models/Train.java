package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity("Train")
public class Train extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Document visionStatement;
	private Document solutionStatement;

	@Relationship(type = "HAS_TEAM", direction = Relationship.OUTGOING)
	private Set<ImplementationTeam> peopleAndLocations;

	private Document teamDesignStrategy;

	private Set<ProgramIncrement> pi;

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

	public Document getVisionStatement() {
		return visionStatement;
	}

	public void setVisionStatement(Document visionStatement) {
		this.visionStatement = visionStatement;
	}

	public Document getSolutionStatement() {
		return solutionStatement;
	}

	public void setSolutionStatement(Document solutionStatement) {
		this.solutionStatement = solutionStatement;
	}

	public Set<ImplementationTeam> getPeopleAndLocations() {
		return peopleAndLocations;
	}

	public void setPeopleAndLocations(Set<ImplementationTeam> peopleAndLocations) {
		this.peopleAndLocations = peopleAndLocations;
	}

	public Document getTeamDesignStrategy() {
		return teamDesignStrategy;
	}

	public void setTeamDesignStrategy(Document teamDesignStrategy) {
		this.teamDesignStrategy = teamDesignStrategy;
	}

	public Set<ProgramIncrement> getPi() {
		return pi;
	}

	public void setPi(Set<ProgramIncrement> pi) {
		this.pi = pi;
	}

}