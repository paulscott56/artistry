package artistry.models;

import java.io.Serializable;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.CustomerTypeEnum;

@NodeEntity
public class CustomerType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private CustomerTypeEnum type;
	private EmailAddress customerEmailAddress;
	private Country customerCountry;
	private Document commercialOutline;
	private CommunicationPreferences communicationsPreferences;

}
