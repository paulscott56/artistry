package artistry.models;

import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.Role;

@NodeEntity("PrincipalRole")
public class PrincipalRole extends AbstractAuditableBaseEntity {

	private Role role;
	private Person person;
	private String description;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
