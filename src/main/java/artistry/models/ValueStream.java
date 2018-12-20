package artistry.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ValueStream {

	@Id
	private Long id;

	private OperationalValueStream operationalValueStream;
	private DevelopmentValueStream developmentValueStream;
	private List<Train> trains;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OperationalValueStream getOperationalValueStream() {
		return operationalValueStream;
	}

	public void setOperationalValueStream(OperationalValueStream operationalValueStream) {
		this.operationalValueStream = operationalValueStream;
	}

	public DevelopmentValueStream getDevelopmentValueStream() {
		return developmentValueStream;
	}

	public void setDevelopmentValueStream(DevelopmentValueStream developmentValueStream) {
		this.developmentValueStream = developmentValueStream;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
}