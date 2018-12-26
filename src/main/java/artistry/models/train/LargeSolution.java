package artistry.models.train;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;

@NodeEntity
public class LargeSolution {

	@Id
	@GeneratedValue
	private Long id;

	private Person solutionArchitect;

	@Relationship(type = "IS_SOLUTION_MANAGER", direction = Relationship.INCOMING)
	private List<Person> solutionManagement;

	@Relationship(type = "IS_SOLUTION_TRAIN_ENGINEER", direction = Relationship.INCOMING)
	private Person solutionTrainEngineer;

}
