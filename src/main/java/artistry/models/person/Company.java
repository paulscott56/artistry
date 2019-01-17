package artistry.models.person;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.geonames.Country;

@NodeEntity
public class Company {

	@Id
	@GeneratedValue
	private Long id;

	private String companyName;
	private Address companyAddress;
	private PhoneNumber phoneNumber;
	private EmailAddress emailAddress;
	private Double latitude;
	private Double longitude;

	@Relationship(type = "HAS_CONTACT_PERSON", direction = Relationship.OUTGOING)
	private Person contactPerson;

	@Relationship(type = "HAS_EMPLOYEE", direction = Relationship.OUTGOING)
	private Set<Person> employees;

	@Relationship(type = "HAS_TEAM", direction = Relationship.OUTGOING)
	private Set<ImplementationTeam> teams;
	
	@Relationship(type = "IN_COUNTRY", direction = Relationship.OUTGOING)
	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Person getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(Person contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Set<Person> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Person> employees) {
		this.employees = employees;
	}

	public Set<ImplementationTeam> getTeams() {
		return teams;
	}

	public void setTeams(Set<ImplementationTeam> teams) {
		this.teams = teams;
	}

}
