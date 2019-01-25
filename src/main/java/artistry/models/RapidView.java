package artistry.models;

import java.io.Serializable;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class RapidView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Relationship(type = "HAS_RAPIDVIEW_ENTRIES", direction = Relationship.OUTGOING)
	private Set<RapidviewEntry> views;

	public Set<RapidviewEntry> getViews() {
		return views;
	}

	public void setViews(Set<RapidviewEntry> views) {
		this.views = views;
	}
}