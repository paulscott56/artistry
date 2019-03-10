package artistry.models;

import artistry.enums.CustomerTypeEnum;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class CustomerType {

	@Id
	@GeneratedValue
	private Long id;

	private CustomerTypeEnum type;
	private EmailAddress customerEmailAddress;
	private Country customerCountry;
	private Document commercialOutline;
	private CommunicationPreferences communicationsPreferences;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerTypeEnum getType() {
        return type;
    }

    public void setType(CustomerTypeEnum type) {
        this.type = type;
    }

    public EmailAddress getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(EmailAddress customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public Country getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(Country customerCountry) {
        this.customerCountry = customerCountry;
    }

    public Document getCommercialOutline() {
        return commercialOutline;
    }

    public void setCommercialOutline(Document commercialOutline) {
        this.commercialOutline = commercialOutline;
    }

    public CommunicationPreferences getCommunicationsPreferences() {
        return communicationsPreferences;
    }

    public void setCommunicationsPreferences(CommunicationPreferences communicationsPreferences) {
        this.communicationsPreferences = communicationsPreferences;
    }
}
