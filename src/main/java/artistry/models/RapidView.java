package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class RapidView {

    @Id
    @GeneratedValue
    private Long id;

	@Relationship(type = "HAS_RAPIDVIEW_ENTRIES", direction = Relationship.OUTGOING)
	private Set<RapidviewEntry> views;

	public Set<RapidviewEntry> getViews() {
		return views;
	}

	public void setViews(Set<RapidviewEntry> views) {
		this.views = views;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}