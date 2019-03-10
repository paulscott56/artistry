package artistry.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "votes", "hasVoted" })
@NodeEntity
public class Votes {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("self")
	private String self;
	@JsonProperty("votes")
	private Integer votes;
	@JsonProperty("hasVoted")
	private Boolean hasVoted;

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@JsonProperty("votes")
	public Integer getVotes() {
		return votes;
	}

	@JsonProperty("votes")
	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	@JsonProperty("hasVoted")
	public Boolean getHasVoted() {
		return hasVoted;
	}

	@JsonProperty("hasVoted")
	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}