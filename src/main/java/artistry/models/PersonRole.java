package artistry.models;

import artistry.enums.Role;
import artistry.utils.RoleTypeEnumConverter;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class PersonRole {

	@Id
	@GeneratedValue
	private Long id;

	@CsvBindByPosition(position = 0)
	private String roleName;
	@CsvCustomBindByPosition(converter = RoleTypeEnumConverter.class, position = 1)
	private Role role;
	@CsvBindByPosition(position = 2)
	private String roleDescription;
	@CsvBindByPosition(position = 3)
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