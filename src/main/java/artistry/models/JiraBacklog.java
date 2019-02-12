package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class JiraBacklog {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_BACKLOG_ISSUES", direction = Relationship.OUTGOING)
	private Set<JiraIssues> issues;

	private String errorOrComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<JiraIssues> getIssues() {
		return issues;
	}

	public void setIssues(Set<JiraIssues> issues) {
		this.issues = issues;
	}

	public String getErrorOrComment() {
		return errorOrComment;
	}

	public void setErrorOrComment(String errorOrComment) {
		this.errorOrComment = errorOrComment;
	}

}
