package artistry.models;

import java.util.Date;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class KPI {

	@Id
	@GeneratedValue
	private Long id;
	
	private String objective;
	private Set<Person> stakeholders;
	private Set<Document> review;
	private Set<Document> attachedDocumentation;
	private Date creationDate;
	private Date modificationDate;
	private int version;
	private boolean active;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public Set<Person> getStakeholders() {
		return stakeholders;
	}
	public void setStakeholders(Set<Person> stakeholders) {
		this.stakeholders = stakeholders;
	}
	public Set<Document> getReview() {
		return review;
	}
	public void setReview(Set<Document> review) {
		this.review = review;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Set<Document> getAttachedDocumentation() {
		return attachedDocumentation;
	}
	public void setAttachedDocumentation(Set<Document> attachedDocumentation) {
		this.attachedDocumentation = attachedDocumentation;
	}
	
	
}
