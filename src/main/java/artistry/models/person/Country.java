package artistry.models.person;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Country {

	@Id
	@GeneratedValue
	private Long id;

	private String iso3166alpha2;
	private String iso3166alpha3;
	private String iso3166numeric;
	private String fips;
	private String country;
	private String capital;
	private Long areaInSqKm;
	private Long population;
	private String continent;

	// TODO: we will need geo polygon outlines here too (Bounding boxes)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIso3166alpha2() {
		return iso3166alpha2;
	}

	public void setIso3166alpha2(String iso3166alpha2) {
		this.iso3166alpha2 = iso3166alpha2;
	}

	public String getIso3166alpha3() {
		return iso3166alpha3;
	}

	public void setIso3166alpha3(String iso3166alpha3) {
		this.iso3166alpha3 = iso3166alpha3;
	}

	public String getIso3166numeric() {
		return iso3166numeric;
	}

	public void setIso3166numeric(String iso3166numeric) {
		this.iso3166numeric = iso3166numeric;
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

	public Long getAreaInSqKm() {
		return areaInSqKm;
	}

	public void setAreaInSqKm(Long areaInSqKm) {
		this.areaInSqKm = areaInSqKm;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
