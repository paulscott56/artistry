package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraApplicationRoles {

	@Id
	@GeneratedValue
	private Long id;

	private int size;
	// TODO: find out the schema for this
	private Set<Object> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Set<Object> getItems() {
		return items;
	}

	public void setItems(Set<Object> items) {
		this.items = items;
	}

}
