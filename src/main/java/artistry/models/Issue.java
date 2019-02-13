package artistry.models;

import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@NodeEntity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "self", "key", "fields" })
public class Issue {

	@JsonProperty("id")
	private String id;
	@JsonProperty("self")
	private String self;
	@JsonProperty("key")
	private String key;
	@JsonProperty("fields")
	private Fields fields;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	@JsonProperty("fields")
	public Fields getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(Fields fields) {
		this.fields = fields;
	}

}