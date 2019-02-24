package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

/**
 * Model for Capability. Capability is made up of many features
 * 
 * @author paul
 * @link https://www.scaledagileframework.com/features-and-capabilities/
 */
@NodeEntity
public class Capability extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "HAS_FEATURE", direction = Relationship.OUTGOING)
	private Set<Feature> features;

	private String capabilityName;
	private Document benefitHypothesis;

	// does this capability stretch multiple trains or just one?
	@Relationship(type = "ON_TRAIN", direction = Relationship.OUTGOING)
	private List<Train> trains;

	private SolutionBacklog solutionBacklog;

	@Relationship(type = "HAS_ENABLER", direction = Relationship.OUTGOING)
	private Set<Enabler> enablers;

	private boolean accepted;

	public String getCapabilityName() {
		return capabilityName;
	}

	public void setCapabilityName(String capabilityName) {
		this.capabilityName = capabilityName;
	}

	public Document getBenefitHypothesis() {
		return benefitHypothesis;
	}

	public void setBenefitHypothesis(Document benefitHypothesis) {
		this.benefitHypothesis = benefitHypothesis;
	}

	public SolutionBacklog getSolutionBacklog() {
		return solutionBacklog;
	}

	public void setSolutionBacklog(SolutionBacklog solutionBacklog) {
		this.solutionBacklog = solutionBacklog;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
}
