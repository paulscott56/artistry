package artistry.models.jira;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class SprintList {

	@Relationship(type = "HAS_SPRINT_ENTRY", direction = Relationship.OUTGOING)
	private List<SprintEntry> sprints;

	@Relationship(type = "HAS_VELOCITY", direction = Relationship.OUTGOING)
	private List<VelocityEntry> velocities;

	public List<SprintEntry> getSprints() {
		return sprints;
	}

	public void setSprints(List<SprintEntry> sprints) {
		this.sprints = sprints;
	}

	public List<VelocityEntry> getVelocities() {
		return velocities;
	}

	public void setVelocities(List<VelocityEntry> velocities) {
		this.velocities = velocities;
	}
}