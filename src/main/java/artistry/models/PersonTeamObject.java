package artistry.models;

import java.util.List;

import artistry.enums.Role;

public class PersonTeamObject extends AbstractAuditableBaseEntity {

	private Long personId;
	private Long implementationTeamId;
	private List<Role> roles;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getImplementationTeamId() {
		return implementationTeamId;
	}

	public void setImplementationTeamId(Long implemantationTeamId) {
		this.implementationTeamId = implemantationTeamId;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}