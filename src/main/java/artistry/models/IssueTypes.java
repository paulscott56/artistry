package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class IssueTypes {
	@Id
	@GeneratedValue
	private Long id;

	private List<IssueType> issueTypes;
	private String errorOrWarning;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<IssueType> getIssueTypes() {
		return issueTypes;
	}

	public void setIssueTypes(List<IssueType> issueTypes) {
		this.issueTypes = issueTypes;
	}

	public String getErrorOrWarning() {
		return errorOrWarning;
	}

	public void setErrorOrWarning(String errorOrWarning) {
		this.errorOrWarning = errorOrWarning;
	}

}
