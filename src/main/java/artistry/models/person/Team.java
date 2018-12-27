package artistry.models.person;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Team {

	@Id
	@GeneratedValue
	private Long id;

	private String teamName;
	private EmailAddress teamEmail;
	private Company company;

	@Relationship(type = "HAS_TEAM_MEMBER", direction = Relationship.OUTGOING)
	private List<Person> teamMembers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public EmailAddress getTeamEmail() {
		return teamEmail;
	}

	public void setTeamEmail(EmailAddress teamEmail) {
		this.teamEmail = teamEmail;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Person> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<Person> teamMembers) {
		this.teamMembers = teamMembers;
	}

}
