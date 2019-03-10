package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
class VelocityStatEntry {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_VELOCITY_ENTRY", direction = Relationship.INCOMING)
	private VelocityEntry entry;

	public VelocityEntry getEntry() {
		return entry;
	}

	public void setEntry(VelocityEntry entry) {
		this.entry = entry;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
