package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ConfluenceBody {

    @Id
    @GeneratedValue
    private Long id;

    private ConfluenceStorage storage;

    public ConfluenceStorage getStorage() {
        return storage;
    }

    public void setStorage(ConfluenceStorage storage) {
        this.storage = storage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
