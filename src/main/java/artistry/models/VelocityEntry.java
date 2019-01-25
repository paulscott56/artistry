package artistry.models;

import java.io.Serializable;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class VelocityEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_RAPIDVIEW_ID", direction = Relationship.INCOMING)
	private String rapidviewId;

	private int jiraId;

	@Relationship(type = "HAS_ESTIMATION", direction = Relationship.INCOMING)
	private Estimated estimated;

	@Relationship(type = "HAS_COMPLETED", direction = Relationship.INCOMING)
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
