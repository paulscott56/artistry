package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraFilter {

    @Id
    @GeneratedValue
    private Long id;

    private String filterkey;
    private String filtervalue;

    public String getFilterkey() {
        return filterkey;
    }

    public void setFilterkey(String filterkey) {
        this.filterkey = filterkey;
    }

    public String getFiltervalue() {
        return filtervalue;
    }

    public void setFiltervalue(String filtervalue) {
        this.filtervalue = filtervalue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
