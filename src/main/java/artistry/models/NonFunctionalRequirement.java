package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Properties;

import java.util.Map;

@NodeEntity
public class NonFunctionalRequirement extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Properties
	private Map<String, String> keyValuePairs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<String, String> getKeyValuePairs() {
		return keyValuePairs;
	}

	public void setKeyValuePairs(Map<String, String> keyValuePairs) {
		this.keyValuePairs = keyValuePairs;
	}

}