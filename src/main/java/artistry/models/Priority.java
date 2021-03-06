package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "iconUrl", "name", "id" })
@NodeEntity
public class Priority {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("self")
	private String self;
	@JsonProperty("iconUrl")
	private String iconUrl;
	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private String jiraId;

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@JsonProperty("iconUrl")
	public String getIconUrl() {
		return iconUrl;
	}

	@JsonProperty("iconUrl")
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("id")
	public String getJiraId() {
		return jiraId;
	}

	@JsonProperty("id")
	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}