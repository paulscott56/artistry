package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.opencsv.bean.CsvBindByPosition;

@NodeEntity
public class GeoMajorCity {

	@Id
	@GeneratedValue
	private Long id;

	@CsvBindByPosition(position = 0)
	private String geonameId;
	@CsvBindByPosition(position = 1)
	private String name;
	@CsvBindByPosition(position = 2)
	private String asciiName;

	@CsvBindByPosition(position = 3)
	@Relationship(type = "HAS_ALTERNATE_NAME", direction = Relationship.OUTGOING)
	private String alternateNames;

	@CsvBindByPosition(position = 4)
	private String latitude;
	@CsvBindByPosition(position = 5)
	private String longitude;

	@CsvBindByPosition(position = 6)
	private String featureClass;
	@CsvBindByPosition(position = 7)
	private String featureCode;

	@CsvBindByPosition(position = 8)
	private String countryCode;

	@CsvBindByPosition(position = 9)
	private String cc2;
	@CsvBindByPosition(position = 10)
	private String admin1Code;
	@CsvBindByPosition(position = 11)
	private String admin2Code;
	@CsvBindByPosition(position = 12)
	private String admin3Code;
	@CsvBindByPosition(position = 13)
	private String admin4Code;
	@CsvBindByPosition(position = 14)
	private String population;
	@CsvBindByPosition(position = 15)
	private String elevation;
	@CsvBindByPosition(position = 16)
	private String dem;
	@CsvBindByPosition(position = 17)
	private String timezoneId;

	@CsvBindByPosition(position = 18)
	// @DateString("yyyy-MM-dd")
	private String modificationDate;

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

	public String getGeonameId() {
		return geonameId;
	}

	public void setGeonameId(String geonameId) {
		this.geonameId = geonameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAsciiName() {
		return asciiName;
	}

	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}

	public String getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(String alternateNames) {
		this.alternateNames = alternateNames;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getFeatureClass() {
		return featureClass;
	}

	public void setFeatureClass(String featureClass) {
		this.featureClass = featureClass;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCc2() {
		return cc2;
	}

	public void setCc2(String cc2) {
		this.cc2 = cc2;
	}

	public String getAdmin1Code() {
		return admin1Code;
	}

	public void setAdmin1Code(String admin1Code) {
		this.admin1Code = admin1Code;
	}

	public String getAdmin2Code() {
		return admin2Code;
	}

	public void setAdmin2Code(String admin2Code) {
		this.admin2Code = admin2Code;
	}

	public String getAdmin3Code() {
		return admin3Code;
	}

	public void setAdmin3Code(String admin3Code) {
		this.admin3Code = admin3Code;
	}

	public String getAdmin4Code() {
		return admin4Code;
	}

	public void setAdmin4Code(String admin4Code) {
		this.admin4Code = admin4Code;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getDem() {
		return dem;
	}

	public void setDem(String dem) {
		this.dem = dem;
	}

	public String getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(String timezoneId) {
		this.timezoneId = timezoneId;
	}

	public String getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

}