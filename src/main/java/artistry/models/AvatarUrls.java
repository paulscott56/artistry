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
@JsonPropertyOrder({ "48x48", "24x24", "16x16", "32x32" })
public class AvatarUrls {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	@JsonProperty("48x48")
	private String _48x48;
	@JsonProperty("24x24")
	private String _24x24;
	@JsonProperty("16x16")
	private String _16x16;
	@JsonProperty("32x32")
	private String _32x32;

	@JsonProperty("48x48")
	public String get48x48() {
		return _48x48;
	}

	@JsonProperty("48x48")
	public void set48x48(String _48x48) {
		this._48x48 = _48x48;
	}

	@JsonProperty("24x24")
	public String get24x24() {
		return _24x24;
	}

	@JsonProperty("24x24")
	public void set24x24(String _24x24) {
		this._24x24 = _24x24;
	}

	@JsonProperty("16x16")
	public String get16x16() {
		return _16x16;
	}

	@JsonProperty("16x16")
	public void set16x16(String _16x16) {
		this._16x16 = _16x16;
	}

	@JsonProperty("32x32")
	public String get32x32() {
		return _32x32;
	}

	@JsonProperty("32x32")
	public void set32x32(String _32x32) {
		this._32x32 = _32x32;
	}
}