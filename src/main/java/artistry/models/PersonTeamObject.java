package artistry.models;

import artistry.enums.Role;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@NodeEntity
public class PersonTeamObject extends AbstractAuditableBaseEntity {

    @Id
    @GeneratedValue
    private Long id;

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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
