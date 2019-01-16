package artistry.models.person;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.Role;

@NodeEntity
public class PersonRole {

	@Id
	@GeneratedValue
	private Long id;
	
	private String roleName;
	private Role role;
	private String roleDescription;
	private boolean safeRole;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public boolean isSafeRole() {
		return safeRole;
	}
	public void setSafeRole(boolean safeRole) {
		this.safeRole = safeRole;
	}		
}