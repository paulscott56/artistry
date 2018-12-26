package artistry.models.jira;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class VelocityStatEntry {

	private VelocityEntry entry;

	public VelocityEntry getEntry() {
		return entry;
	}

	public void setEntry(VelocityEntry entry) {
		this.entry = entry;
	}

}
