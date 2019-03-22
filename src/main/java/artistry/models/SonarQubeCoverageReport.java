package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SonarQubeCoverageReport {

	@Id
	@GeneratedValue
	private Long id;

	private SonarQubeComponent component;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SonarQubeComponent getComponent() {
		return component;
	}

	public void setComponent(SonarQubeComponent component) {
		this.component = component;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
