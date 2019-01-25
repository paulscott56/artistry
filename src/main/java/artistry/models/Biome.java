package artistry.models;

import java.math.BigDecimal;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @see https://www.pik-potsdam.de/members/cramer/publications/before-2005/Cramer_2002_Enc_GEC.pdf
 * @author paul
 *
 */
@NodeEntity
public class Biome {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private BigDecimal meanTempWarmestMonth;
	private BigDecimal meanTempColdestMonth;
	private BigDecimal rangeInCelcius;
	private BigDecimal meanAnnualTotalPrecipitation;
	private BigDecimal moistureIndex;
	private BigDecimal meanTotalPrecipitationWettestMonth;
	private BigDecimal meanTotalPrecipitationDriestMonth;
	private BigDecimal meanTotalPrecipitationWarmestMonth;

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

	public BigDecimal getMeanTempWarmestMonth() {
		return meanTempWarmestMonth;
	}

	public void setMeanTempWarmestMonth(BigDecimal meanTempWarmestMonth) {
		this.meanTempWarmestMonth = meanTempWarmestMonth;
	}

	public BigDecimal getMeanTempColdestMonth() {
		return meanTempColdestMonth;
	}

	public void setMeanTempColdestMonth(BigDecimal meanTempColdestMonth) {
		this.meanTempColdestMonth = meanTempColdestMonth;
	}

	public BigDecimal getRangeInCelcius() {
		return rangeInCelcius;
	}

	public void setRangeInCelcius(BigDecimal rangeInCelcius) {
		this.rangeInCelcius = rangeInCelcius;
	}

	public BigDecimal getMeanAnnualTotalPrecipitation() {
		return meanAnnualTotalPrecipitation;
	}

	public void setMeanAnnualTotalPrecipitation(BigDecimal meanAnnualTotalPrecipitation) {
		this.meanAnnualTotalPrecipitation = meanAnnualTotalPrecipitation;
	}

	public BigDecimal getMoistureIndex() {
		return moistureIndex;
	}

	public void setMoistureIndex(BigDecimal moistureIndex) {
		this.moistureIndex = moistureIndex;
	}

	public BigDecimal getMeanTotalPrecipitationWettestMonth() {
		return meanTotalPrecipitationWettestMonth;
	}

	public void setMeanTotalPrecipitationWettestMonth(BigDecimal meanTotalPrecipitationWettestMonth) {
		this.meanTotalPrecipitationWettestMonth = meanTotalPrecipitationWettestMonth;
	}

	public BigDecimal getMeanTotalPrecipitationDriestMonth() {
		return meanTotalPrecipitationDriestMonth;
	}

	public void setMeanTotalPrecipitationDriestMonth(BigDecimal meanTotalPrecipitationDriestMonth) {
		this.meanTotalPrecipitationDriestMonth = meanTotalPrecipitationDriestMonth;
	}

	public BigDecimal getMeanTotalPrecipitationWarmestMonth() {
		return meanTotalPrecipitationWarmestMonth;
	}

	public void setMeanTotalPrecipitationWarmestMonth(BigDecimal meanTotalPrecipitationWarmestMonth) {
		this.meanTotalPrecipitationWarmestMonth = meanTotalPrecipitationWarmestMonth;
	}

}
