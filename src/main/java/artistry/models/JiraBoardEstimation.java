package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public class JiraBoardEstimation {

	@Id
	@GeneratedValue
	private Long id;

	private JiraBoardField field;
	private String type;

	public JiraBoardField getField() {
		return field;
	}

	public void setField(JiraBoardField field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
