package artistry.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class WorkLogs {

	@Id
	@GeneratedValue
	private Long id;

	private String self;
	private Author author;
	private Author updateAuthor;
	private String created;
	private String updated;
	private String started;
	private String timeSpent;
	private int timeSpentSeconds;
	@JsonProperty("id")
	private String jiraId;
	private String issueId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getUpdateAuthor() {
		return updateAuthor;
	}

	public void setUpdateAuthor(Author updateAuthor) {
		this.updateAuthor = updateAuthor;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getStarted() {
		return started;
	}

	public void setStarted(String started) {
		this.started = started;
	}

	public String getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}

	public int getTimeSpentSeconds() {
		return timeSpentSeconds;
	}

	public void setTimeSpentSeconds(int timeSpentSeconds) {
		this.timeSpentSeconds = timeSpentSeconds;
	}

	@JsonProperty("id")
	public String getJiraId() {
		return jiraId;
	}

	@JsonProperty("id")
	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

}
