package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class Enabler extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String enablerName;

}
