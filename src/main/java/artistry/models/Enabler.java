package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class Enabler {

	@Id
	@GeneratedValue
	private Long id;

	private String enablerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnablerName() {
        return enablerName;
    }

    public void setEnablerName(String enablerName) {
        this.enablerName = enablerName;
    }
}
