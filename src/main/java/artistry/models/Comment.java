package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "comments", "maxResults", "total", "startAt" })
@NodeEntity
public class Comment {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("comments")
	private List<Comment> comments = null;
	@JsonProperty("maxResults")
	private Integer maxResults;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("startAt")
	private Integer startAt;

	@JsonProperty("comments")
	public List<Comment> getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(List<Comment> comments) {
		this.comments = comments;
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

	@JsonProperty("startAt")
	public Integer getStartAt() {
		return startAt;
	}

	@JsonProperty("startAt")
	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}