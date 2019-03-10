package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraWebHookMessage {

	@Id
	@GeneratedValue
	private Long id;

	private Long timestamp;
	private String webhookEvent;
	private String issue_event_type_name;
	private User user;
	private Issue issue;
	private Changelog changelog;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getWebhookEvent() {
		return webhookEvent;
	}

	public void setWebhookEvent(String webhookEvent) {
		this.webhookEvent = webhookEvent;
	}

	public String getIssue_event_type_name() {
		return issue_event_type_name;
	}

	public void setIssue_event_type_name(String issue_event_type_name) {
		this.issue_event_type_name = issue_event_type_name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public Changelog getChangelog() {
		return changelog;
	}

	public void setChangelog(Changelog changelog) {
		this.changelog = changelog;
	}


}
