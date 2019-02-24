package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
class Ocean extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private long averageDepth;

	@Relationship(type = "HAS_FEATURE", direction = Relationship.OUTGOING)
	private List<OceanFeature> feature;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAverageDepth() {
		return averageDepth;
	}

	public void setAverageDepth(long averageDepth) {
		this.averageDepth = averageDepth;
	}

	public List<OceanFeature> getFeature() {
		return feature;
	}

	public void setFeature(List<OceanFeature> feature) {
		this.feature = feature;
	}

}
