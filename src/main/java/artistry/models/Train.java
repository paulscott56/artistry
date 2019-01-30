package artistry.models;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity("Train")
public class Train extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Document visionStatement;
	private Document solutionStatement;

	@Relationship(type = "HAS_TEAM", direction = Relationship.OUTGOING)
	private Set<ImplementationTeam> peopleAndLocations;

	private Document teamDesignStrategy;

	private Set<ProgramIncrement> pi;

}