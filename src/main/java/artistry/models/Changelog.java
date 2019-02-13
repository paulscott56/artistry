package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

}