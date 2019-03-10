package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@NodeEntity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "items" })
public class Changelog {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("id")
	private String jiraId;
	@JsonProperty("items")
	private List<Item> items = null;

	@JsonProperty("id")
	public String getJiraId() {
		return jiraId;
	}

	@JsonProperty("id")
	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}