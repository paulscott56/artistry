package artistry.models.train;

import java.util.Date;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.models.person.ImplementationTeam;


@NodeEntity
public class Feature {

	@Id
	@GeneratedValue
	private Long id;
	
	private String featureName;
	private Document featureDescription;
	private Date lastModificationDate;
	private Date creationDate;
	private Date completionDate;
	private Set<Document> acceptanceCriteria;
	private Integer businessValue;
	private boolean complete;
	private Set<ImplementationTeam> implementationTeams;
	private WeightedShortestJobFirst wsjf;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public Document getFeatureDescription() {
		return featureDescription;
	}
	public void setFeatureDescription(Document featureDescription) {
		this.featureDescription = featureDescription;
	}
	public Date getLastModificationDate() {
		return lastModificationDate;
	}
	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public Set<Document> getAcceptanceCriteria() {
		return acceptanceCriteria;
	}
	public void setAcceptanceCriteria(Set<Document> acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}
	public Integer getBusinessValue() {
		return businessValue;
	}
	public void setBusinessValue(Integer businessValue) {
		this.businessValue = businessValue;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public Set<ImplementationTeam> getImplementationTeams() {
		return implementationTeams;
	}
	public void setImplementationTeams(Set<ImplementationTeam> implementationTeams) {
		this.implementationTeams = implementationTeams;
	}
	public WeightedShortestJobFirst getWsjf() {
		return wsjf;
	}
	public void setWsjf(WeightedShortestJobFirst wsjf) {
		this.wsjf = wsjf;
	}	
}
