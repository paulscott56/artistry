package artistry.models.person;

import java.time.LocalDateTime;
import java.util.TimeZone;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.geonames.Country;
import artistry.models.geonames.Place;

@NodeEntity
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String surname;
	private String username;
	private String nickname;

	@Relationship(type = "LIVES_IN_COUNTRY", direction = Relationship.OUTGOING)
	private Country country;

	@Relationship(type = "IS_AT_PLACE", direction = Relationship.OUTGOING)
	private Place place;

	@Relationship(type = "WORKS_FOR", direction = Relationship.OUTGOING)
	private Company company;

	@Relationship(type = "HAS_EMAIL_ADDRESS", direction = Relationship.OUTGOING)
	private EmailAddress emailAddress;

	@Relationship(type = "HAS_PHONE", direction = Relationship.OUTGOING)
	private PhoneNumber phoneNumber;
	private Address address;

	@Relationship(type = "IN_TIMEZONE", direction = Relationship.OUTGOING)
	private TimeZone timezone;

	private LocalDateTime dateCreated;

	private Boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public TimeZone getTimezone() {
		return timezone;
	}

	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
}
