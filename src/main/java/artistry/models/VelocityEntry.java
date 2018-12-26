package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class VelocityEntry {

	@Id
	@GeneratedValue
	private Long id;

	private String rapidviewId;
	private int jiraId;
	private Estimated estimated;
	private Completed completed;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRapidviewId() {
		return rapidviewId;
	}

	public void setRapidviewId(String rapidviewId) {
		this.rapidviewId = rapidviewId;
	}

	public Estimated getEstimated() {
		return estimated;
	}

	public void setEstimated(Estimated estimated) {
		this.estimated = estimated;
	}

	public Completed getCompleted() {
		return completed;
	}

	public void setCompleted(Completed completed) {
		this.completed = completed;
	}

	public int getJiraId() {
		return jiraId;
	}

	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

}
