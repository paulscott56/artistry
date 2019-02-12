package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraBacklog {

	@Id
	@GeneratedValue
	private Long id;

	private List<JiraIssues> issues;

	private String errorOrComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<JiraIssues> getIssues() {
		return issues;
	}

	public void setIssues(List<JiraIssues> issues) {
		this.issues = issues;
	}

	public String getErrorOrComment() {
		return errorOrComment;
	}

	public void setErrorOrComment(String errorOrComment) {
		this.errorOrComment = errorOrComment;
	}

}
