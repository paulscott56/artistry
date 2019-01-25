package artistry.models;

import java.io.Serializable;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Estimated implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
