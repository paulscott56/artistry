package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

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

}
