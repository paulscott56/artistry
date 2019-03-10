package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.math.BigDecimal;
import java.util.Set;

@NodeEntity
public class WeightedShortestJobFirst {

	@Id
	@GeneratedValue
	private Long id;

	private BigDecimal userBusinessValue;
	private BigDecimal timeCriticality;
	private BigDecimal riskReductionOrOpportunity;
	private BigDecimal costOfDelay;
	private BigDecimal jobSize;
	private BigDecimal wsjfValue;
	private Set<Document> attachedDocuments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getUserBusinessValue() {
		return userBusinessValue;
	}

	public void setUserBusinessValue(BigDecimal userBusinessValue) {
		this.userBusinessValue = userBusinessValue;
	}

	public BigDecimal getTimeCriticality() {
		return timeCriticality;
	}

	public void setTimeCriticality(BigDecimal timeCriticality) {
		this.timeCriticality = timeCriticality;
	}

	public BigDecimal getRiskReductionOrOpportunity() {
		return riskReductionOrOpportunity;
	}

	public void setRiskReductionOrOpportunity(BigDecimal riskReductionOrOpportunity) {
		this.riskReductionOrOpportunity = riskReductionOrOpportunity;
	}

	public BigDecimal getCostOfDelay() {
		return costOfDelay;
	}

	public void setCostOfDelay(BigDecimal costOfDelay) {
		this.costOfDelay = costOfDelay;
	}

	public BigDecimal getJobSize() {
		return jobSize;
	}

	public void setJobSize(BigDecimal jobSize) {
		this.jobSize = jobSize;
	}

	public BigDecimal getWsjfValue() {
		return wsjfValue;
	}

	public void setWsjfValue(BigDecimal wsjfValue) {
		this.wsjfValue = wsjfValue;
	}

	public Set<Document> getAttachedDocuments() {
		return attachedDocuments;
	}

	public void setAttachedDocuments(Set<Document> attachedDocuments) {
		this.attachedDocuments = attachedDocuments;
	}

}
