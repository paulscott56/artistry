package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "progress", "total" })
@NodeEntity
public class Progress {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("progress")
	private Integer progress;
	@JsonProperty("total")
	private Integer total;

	@JsonProperty("progress")
	public Integer getProgress() {
		return progress;
	}

	@JsonProperty("progress")
	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}