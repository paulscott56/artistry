package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SprintList {

	private List<SprintEntry> sprints;
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