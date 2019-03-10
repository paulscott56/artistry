package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class JiraEpics {

	@Id
	@GeneratedValue
	private Long id;

	private Set<JiraEpic> values;

	private String errorOrComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<JiraEpic> getValues() {
		return values;
	}

	public void setValues(Set<JiraEpic> values) {
		this.values = values;
	}

	public String getErrorOrComment() {
		return errorOrComment;
	}

	public void setErrorOrComment(String errorOrComment) {
		this.errorOrComment = errorOrComment;
	}


}
