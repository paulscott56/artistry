package artistry.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "field", "fieldtype", "from", "fromString", "to", "toString" })
class Item {

    @JsonProperty("field")
    private String field;
    @JsonProperty("fieldtype")
    private String fieldtype;
    @JsonProperty("from")
    private String from;
    @JsonProperty("fromString")
    private String fromString;
    @JsonProperty("to")
    private String to;
    @JsonProperty("toString")
    private String toString;

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("fieldtype")
    public String getFieldtype() {
        return fieldtype;
    }

    @JsonProperty("fieldtype")
    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("fromString")
    public String getFromString() {
        return fromString;
    }

    @JsonProperty("fromString")
    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("toString")
    public String getToString() {
        return toString;
    }

    @JsonProperty("toString")
    public void setToString(String toString) {
        this.toString = toString;
    }


}