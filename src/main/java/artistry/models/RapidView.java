package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class RapidView {

	private List<RapidviewEntry> views;

	public List<RapidviewEntry> getViews() {
		return views;
	}

	public void setViews(List<RapidviewEntry> views) {
		this.views = views;
	}
}