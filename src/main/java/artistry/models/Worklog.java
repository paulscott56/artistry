package artistry.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "startAt", "maxResults", "total", "worklogs" })
@NodeEntity
public class Worklog {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("startAt")
	private Integer startAt;
	@JsonProperty("maxResults")
	private Integer maxResults;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("worklogs")
	private List<WorkLogs> worklogs = null;

	@JsonProperty("startAt")
	public Integer getStartAt() {
		return startAt;
	}

	@JsonProperty("startAt")
	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

	@JsonProperty("maxResults")
	public Integer getMaxResults() {
		return maxResults;
	}

	@JsonProperty("maxResults")
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("worklogs")
	public List<WorkLogs> getWorklogs() {
		return worklogs;
	}

	@JsonProperty("worklogs")
	public void setWorklogs(List<WorkLogs> worklogs) {
		this.worklogs = worklogs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}