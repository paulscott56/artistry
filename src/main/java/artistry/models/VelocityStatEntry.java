package artistry.models;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
class VelocityStatEntry extends AbstractAuditableBaseEntity {

	@Relationship(type = "HAS_VELOCITY_ENTRY", direction = Relationship.INCOMING)
	private VelocityEntry entry;

	public VelocityEntry getEntry() {
		return entry;
	}

	public void setEntry(VelocityEntry entry) {
		this.entry = entry;
	}

}
