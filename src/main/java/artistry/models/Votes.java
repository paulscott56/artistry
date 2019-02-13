package artistry.models;

import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "votes", "hasVoted" })
@NodeEntity
public class Votes {

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

}