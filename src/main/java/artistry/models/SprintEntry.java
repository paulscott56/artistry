package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class SprintEntry extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Relationship(type = "IS_LINKED", direction = Relationship.OUTGOING)
	private String rapidviewId;
	private int jiraId;
	private int sequence;
	private String name;
	private String state;
	private String goal;
	private int linkedPageCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRapidviewId() {
		return rapidviewId;
	}

	public void setRapidviewId(String rapidviewId) {
		this.rapidviewId = rapidviewId;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public int getLinkedPageCount() {
		return linkedPageCount;
	}

	public void setLinkedPageCount(int linkedPageCount) {
		this.linkedPageCount = linkedPageCount;
	}

	public int getJiraId() {
		return jiraId;
	}

	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

}
