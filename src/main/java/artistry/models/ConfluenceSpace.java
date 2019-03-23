package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ConfluenceSpace {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("id")
    private int confluenceId;

    private String key;
    private String name;
    private String type;
    private String status;
    private ConfluenceExpandable _expandable;
    private ConfluenceLinks _links;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public int getConfluenceId() {
        return confluenceId;
    }

    public void setConfluenceId(int confluenceId) {
        this.confluenceId = confluenceId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfluenceExpandable get_expandable() {
        return _expandable;
    }

    public void set_expandable(ConfluenceExpandable _expandable) {
        this._expandable = _expandable;
    }

    public ConfluenceLinks get_links() {
        return _links;
    }

    public void set_links(ConfluenceLinks _links) {
        this._links = _links;
    }
}
