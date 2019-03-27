package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class SonarMeasure {

	@Id
	@GeneratedValue
	private Long id;

	private String metric;
	private String value;
	private Set<SonarPeriod> periods;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Set<SonarPeriod> getPeriods() {
		return periods;
	}

	public void setPeriods(Set<SonarPeriod> periods) {
		this.periods = periods;
	}

}
