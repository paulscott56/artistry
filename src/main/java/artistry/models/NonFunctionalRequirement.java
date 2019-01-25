package artistry.models;

import java.io.Serializable;
import java.util.HashMap;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class NonFunctionalRequirement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private HashMap<String, String> keyValuePairs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HashMap<String, String> getKeyValuePairs() {
		return keyValuePairs;
	}

	public void setKeyValuePairs(HashMap<String, String> keyValuePairs) {
		this.keyValuePairs = keyValuePairs;
	}
	
}