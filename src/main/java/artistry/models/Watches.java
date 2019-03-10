package artistry.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "watchCount", "isWatching" })
@NodeEntity
public class Watches {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("self")
	private String self;
	@JsonProperty("watchCount")
	private Integer watchCount;
	@JsonProperty("isWatching")
	private Boolean isWatching;

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@JsonProperty("watchCount")
	public Integer getWatchCount() {
		return watchCount;
	}

	@JsonProperty("watchCount")
	public void setWatchCount(Integer watchCount) {
		this.watchCount = watchCount;
	}

	@JsonProperty("isWatching")
	public Boolean getIsWatching() {
		return isWatching;
	}

	@JsonProperty("isWatching")
	public void setIsWatching(Boolean isWatching) {
		this.isWatching = isWatching;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getWatching() {
		return isWatching;
	}

	public void setWatching(Boolean watching) {
		isWatching = watching;
	}
}