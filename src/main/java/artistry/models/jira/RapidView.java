package artistry.models.jira;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class RapidView {

	@Relationship(type = "HAS_RAPIDVIEW_ENTRIES", direction = Relationship.OUTGOING)
	private List<RapidviewEntry> views;

	public List<RapidviewEntry> getViews() {
		return views;
	}

	public void setViews(List<RapidviewEntry> views) {
		this.views = views;
	}
}