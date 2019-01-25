package artistry.models;

import java.io.Serializable;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class SprintList implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Relationship(type = "HAS_SPRINT_ENTRY", direction = Relationship.OUTGOING)
	private Set<SprintEntry> sprints;

	@Relationship(type = "HAS_VELOCITY", direction = Relationship.OUTGOING)
	private Set<VelocityEntry> velocities;

	public Set<SprintEntry> getSprints() {
		return sprints;
	}

	public void setSprints(Set<SprintEntry> sprints) {
		this.sprints = sprints;
	}

	public Set<VelocityEntry> getVelocities() {
		return velocities;
	}

	public void setVelocities(Set<VelocityEntry> velocities) {
		this.velocities = velocities;
	}
}