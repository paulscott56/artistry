package artistry.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class LargeSolution {

	@Id
	private Long id;

	private Person solutionArchitect;
	private List<Person> solutionManagement;
	private Person solutionTrainEngineer;

}
