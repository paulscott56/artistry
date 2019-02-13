package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class JiraEpic {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("id")
	private int jiraId;

	private String key;
	private String self;
	private String name;
	private String summary;
	private ColorKey color;
	private boolean done;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("id")
	public int getJiraId() {
		return jiraId;
	}

	@JsonProperty("id")
	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public ColorKey getColor() {
		return color;
	}

	public void setColor(ColorKey color) {
		this.color = color;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
