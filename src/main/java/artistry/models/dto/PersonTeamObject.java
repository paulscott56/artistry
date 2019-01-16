package artistry.models.dto;

import artistry.enums.PersonRole;

public class PersonTeamObject {
	
	private Long personId;
	private Long implemantationTeamId;
	private PersonRole role;
	
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
	public PersonRole getRole() {
		return role;
	}
	public void setRole(PersonRole role) {
		this.role = role;
	}
	
	

}
