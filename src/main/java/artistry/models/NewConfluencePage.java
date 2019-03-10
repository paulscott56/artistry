package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class NewConfluencePage {

    @Id
    @GeneratedValue
    private Long id;

    private String type;
    private String title;
    private ConfluenceSpace space;
    private ConfluenceBody body;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ConfluenceSpace getSpace() {
        return space;
    }

    public void setSpace(ConfluenceSpace space) {
        this.space = space;
    }

    public ConfluenceBody getBody() {
        return body;
    }

    public void setBody(ConfluenceBody body) {
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
