package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.CustomerTypeEnum;

@NodeEntity
public class CustomerType {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private CustomerTypeEnum type;
	private EmailAddress customerEmailAddress;
	private Country customerCountry;
	private Document commercialOutline;
	private CommunicationPreferences communicationsPreferences;

}
