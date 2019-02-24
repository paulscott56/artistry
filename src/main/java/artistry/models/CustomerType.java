package artistry.models;

import artistry.enums.CustomerTypeEnum;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class CustomerType extends AbstractAuditableBaseEntity {

	@Id
	@GeneratedValue
	private Long id;

	private CustomerTypeEnum type;
	private EmailAddress customerEmailAddress;
	private Country customerCountry;
	private Document commercialOutline;
	private CommunicationPreferences communicationsPreferences;

}
