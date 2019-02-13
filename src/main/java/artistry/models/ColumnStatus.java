package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ColumnStatus {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("id")
	private String jiraId;
	private String self;

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

}