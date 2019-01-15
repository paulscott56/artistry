package artistry.models.train;

import java.math.BigDecimal;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

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
	private List<Document> attachedDocuments;
	
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
	public List<Document> getAttachedDocuments() {
		return attachedDocuments;
	}
	public void setAttachedDocuments(List<Document> attachedDocuments) {
		this.attachedDocuments = attachedDocuments;
	}
	
	
	
}
