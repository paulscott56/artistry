package artistry.models.train;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class TestPlan {

	@Id
	@GeneratedValue
	private Long id;
	
	private String testPlanName;
}
