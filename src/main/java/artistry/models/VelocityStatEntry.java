package artistry.models;

import java.io.Serializable;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class VelocityStatEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Relationship(type = "HAS_VELOCITY_ENTRY", direction = Relationship.INCOMING)
	private VelocityEntry entry;

	public VelocityEntry getEntry() {
		return entry;
	}

	public void setEntry(VelocityEntry entry) {
		this.entry = entry;
	}

}
