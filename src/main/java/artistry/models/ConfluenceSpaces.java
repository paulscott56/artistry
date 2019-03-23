package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class ConfluenceSpaces {
    @Id
    @GeneratedValue
    private Long id;

    private Set<ConfluenceSpace> results;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ConfluenceSpace> getResults() {
        return results;
    }

    public void setResults(Set<ConfluenceSpace> results) {
        this.results = results;
    }
}
