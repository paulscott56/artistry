package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class ValueStream {

	@Id
	@GeneratedValue
	private Long id;

	private OperationalValueStream operationalValueStream;
	private DevelopmentValueStream developmentValueStream;

	@Relationship(type = "IS_ON_TRAIN", direction = Relationship.OUTGOING)
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