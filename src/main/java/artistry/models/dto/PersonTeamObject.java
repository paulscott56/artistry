package artistry.models.dto;

import artistry.enums.Role;

public class PersonTeamObject {
	
	private Long personId;
	private Long implemantationTeamId;
	private Role role;
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public Long getImplemantationTeamId() {
		return implemantationTeamId;
	}
	public void setImplemantationTeamId(Long implemantationTeamId) {
		this.implemantationTeamId = implemantationTeamId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
