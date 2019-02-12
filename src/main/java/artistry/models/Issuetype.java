package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@NodeEntity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self", "id", "description", "iconUrl", "name", "subtask", "avatarId" })
public class Issuetype {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("self")
	private String self;
	@JsonProperty("id")
	private String jiraId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("iconUrl")
	private String iconUrl;
	@JsonProperty("name")
	private String name;
	@JsonProperty("subtask")
	private Boolean subtask;
	@JsonProperty("avatarId")
	private Integer avatarId;
	// @JsonIgnore
	// private Map<String, Object> additionalProperties = new HashMap<String,
	// Object>();

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@JsonProperty("id")
	public String getJiraId() {
		return jiraId;
	}

	@JsonProperty("id")
	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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

	@JsonProperty("subtask")
	public Boolean getSubtask() {
		return subtask;
	}

	@JsonProperty("subtask")
	public void setSubtask(Boolean subtask) {
		this.subtask = subtask;
	}

	@JsonProperty("avatarId")
	public Integer getAvatarId() {
		return avatarId;
	}

	@JsonProperty("avatarId")
	public void setAvatarId(Integer avatarId) {
		this.avatarId = avatarId;
	}

	// @JsonAnyGetter
	// public Map<String, Object> getAdditionalProperties() {
	// return this.additionalProperties;
	// }
	//
	// @JsonAnySetter
	// public void setAdditionalProperty(String name, Object value) {
	// this.additionalProperties.put(name, value);
	// }

}