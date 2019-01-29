package artistry.models;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Completed extends AbstractAuditableBaseEntity {

	private double value;
	private String text;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}