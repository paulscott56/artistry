package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraBoardRanking {

    @Id
    @GeneratedValue
    private Long id;

    private String rankCustomFieldId;

    public String getRankCustomFieldId() {
        return rankCustomFieldId;
    }

    public void setRankCustomFieldId(String rankCustomFieldId) {
        this.rankCustomFieldId = rankCustomFieldId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
