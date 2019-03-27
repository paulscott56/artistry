package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class SonarQubeComponent {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("id")
	private String sonarId;
	private String key;
	private String name;
	private String description;
	private String qualifier;
	private Set<SonarMeasure> measures;

	@JsonIgnore
	public Long getId() {
		return id;
	}

	@JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

	public String getSonarId() {
		return sonarId;
	}

	public void setSonarId(String sonarId) {
		this.sonarId = sonarId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public Set<SonarMeasure> getMeasures() {
		return measures;
	}

	public void setMeasures(Set<SonarMeasure> measures) {
		this.measures = measures;
	}

}
