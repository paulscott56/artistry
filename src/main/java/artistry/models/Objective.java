package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;

@NodeEntity
class Objective extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String objectiveName;
	private String objectiveDescription;

	// only required at team level. Perhaps we should link these with relationships
	// for reporting on high value targets?
	private Integer businessValue;

	private boolean stretch;

	private Date dateCreated;
	private Date lastModified;

	@Relationship(type = "IS_OBJECTIVE_OF", direction = Relationship.INCOMING)
	private ProgramIncrement pi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObjectiveName() {
		return objectiveName;
	}

	public void setObjectiveName(String objectiveName) {
		this.objectiveName = objectiveName;
	}

	public String getObjectiveDescription() {
		return objectiveDescription;
	}

	public void setObjectiveDescription(String objectiveDescription) {
		this.objectiveDescription = objectiveDescription;
	}

	public Integer getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(Integer businessValue) {
		this.businessValue = businessValue;
	}

	public boolean isStretch() {
		return stretch;
	}

	public void setStretch(boolean stretch) {
		this.stretch = stretch;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public ProgramIncrement getPi() {
		return pi;
	}

	public void setPi(ProgramIncrement pi) {
		this.pi = pi;
	}
}
