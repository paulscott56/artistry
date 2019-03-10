package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
class SprintList {

    @Id
    @GeneratedValue
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}