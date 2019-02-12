package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class BoardEntry extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	private int jiraId;
	private String url;
	private String name;
	private String type;
	private BoardLocation location;
	private String commentOrError;
	private BoardConfig boardConfig;
	@Relationship(type = "HAS_BACKLOG", direction = Relationship.OUTGOING)
	private JiraBacklog backlog;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getJiraId() {
		return jiraId;
	}

	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BoardLocation getLocation() {
		return location;
	}

	public void setLocation(BoardLocation location) {
		this.location = location;
	}

	public String getCommentOrError() {
		return commentOrError;
	}

	public void setCommentOrError(String commentOrError) {
		this.commentOrError = commentOrError;
	}

	public BoardConfig getBoardConfig() {
		return boardConfig;
	}

	public void setBoardConfig(BoardConfig boardConfig) {
		this.boardConfig = boardConfig;
	}

	public JiraBacklog getBacklog() {
		return backlog;
	}

	public void setBacklog(JiraBacklog backlog) {
		this.backlog = backlog;
	}

}
