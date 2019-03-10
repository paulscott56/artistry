package artistry.models;

import artistry.enums.AddressType;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity("Address")
public class Address {

	@Id
	@GeneratedValue
	private Long id;

	private AddressType addressType;

	private boolean isPostalAddress;
	private String fullAddress;
	private Set<String> addressLine;

	private String city;

	private Country country;

	private String postalCode;

	private Double latitude;
	private Double longitude;

	// TODO: add in GeoJSON Point for the addresses

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public boolean isPostalAddress() {
		return isPostalAddress;
	}

	public void setPostalAddress(boolean isPostalAddress) {
		this.isPostalAddress = isPostalAddress;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Set<String> getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(Set<String> addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

}
