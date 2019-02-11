package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public class Column {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private List<ColumnStatus> statuses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ColumnStatus> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<ColumnStatus> statuses) {
		this.statuses = statuses;
	}

}
