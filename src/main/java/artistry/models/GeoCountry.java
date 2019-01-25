package artistry.models;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;

public class GeoCountry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@CsvBindByPosition(position = 0)
	private String iso;
	@CsvBindByPosition(position = 1)
	private String iso3;
	@CsvBindByPosition(position = 2)
	private String isoNumeric;
	@CsvBindByPosition(position = 3)
	private String fips;
	@CsvBindByPosition(position = 4)
	private String country;
	@CsvBindByPosition(position = 5)
	private String capital;
	@CsvBindByPosition(position = 6)
	private String areainsqkm;
	@CsvBindByPosition(position = 7)
	private String population;
	@CsvBindByPosition(position = 8)
	private String continent;
	@CsvBindByPosition(position = 9)
	private String tld;
	@CsvBindByPosition(position = 10)
	private String currencyCode;
	@CsvBindByPosition(position = 11)
	private String currencyName;
	@CsvBindByPosition(position = 12)
	private String phone;
	@CsvBindByPosition(position = 13)
	private String postalCodeFormat;
	@CsvBindByPosition(position = 14)
	private String postalCodeRegex;
	@CsvBindByPosition(position = 15)
	private String languages;
	@CsvBindByPosition(position = 16)
	private String geonameid;
	@CsvBindByPosition(position = 17)
	private String neighbours;
	@CsvBindByPosition(position = 18)
	private String equivalentFipsCode;

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getIsoNumeric() {
		return isoNumeric;
	}

	public void setIsoNumeric(String isoNumeric) {
		this.isoNumeric = isoNumeric;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getAreainsqkm() {
		return areainsqkm;
	}

	public void setAreainsqkm(String areainsqkm) {
		this.areainsqkm = areainsqkm;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getTld() {
		return tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCodeFormat() {
		return postalCodeFormat;
	}

	public void setPostalCodeFormat(String postalCodeFormat) {
		this.postalCodeFormat = postalCodeFormat;
	}

	public String getPostalCodeRegex() {
		return postalCodeRegex;
	}

	public void setPostalCodeRegex(String postalCodeRegex) {
		this.postalCodeRegex = postalCodeRegex;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getGeonameid() {
		return geonameid;
	}

	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}

	public String getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(String neighbours) {
		this.neighbours = neighbours;
	}

	public String getEquivalentFipsCode() {
		return equivalentFipsCode;
	}

	public void setEquivalentFipsCode(String equivalentFipsCode) {
		this.equivalentFipsCode = equivalentFipsCode;
	}

}
