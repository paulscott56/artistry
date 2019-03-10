package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;
import java.util.Set;

@NodeEntity
public class StrategicTheme {

	@Id
	@GeneratedValue
	private Long id;

	private Set<Document> supportingDocumentation;
	private String themeName;
	private Date creationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Document> getSupportingDocumentation() {
		return supportingDocumentation;
	}

	public void setSupportingDocumentation(Set<Document> supportingDocumentation) {
		this.supportingDocumentation = supportingDocumentation;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
