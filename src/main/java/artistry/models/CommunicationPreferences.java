package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * An object to determine communication preferences. Each field is a boolean as
 * to whether the person/company/etc would like to receive comms on each of the
 * channels listed. This list can (and should) be expanded as you see fit
 * 
 * @author paul
 *
 */
@NodeEntity
class CommunicationPreferences {

    @Id
    @GeneratedValue
    private Long id;

	private boolean marketingEmail;
	private boolean personalEmail;
	private boolean developmentEmail;
	private boolean marketingPhone;
	private boolean personalPhone;
	private boolean developmentPhone;
	private boolean aiCustomer;
	private boolean activeCustomer;

	public boolean isMarketingEmail() {
		return marketingEmail;
	}

	public void setMarketingEmail(boolean marketingEmail) {
		this.marketingEmail = marketingEmail;
	}

	public boolean isPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(boolean personalEmail) {
		this.personalEmail = personalEmail;
	}

	public boolean isDevelopmentEmail() {
		return developmentEmail;
	}

	public void setDevelopmentEmail(boolean developmentEmail) {
		this.developmentEmail = developmentEmail;
	}

	public boolean isMarketingPhone() {
		return marketingPhone;
	}

	public void setMarketingPhone(boolean marketingPhone) {
		this.marketingPhone = marketingPhone;
	}

	public boolean isPersonalPhone() {
		return personalPhone;
	}

	public void setPersonalPhone(boolean personalPhone) {
		this.personalPhone = personalPhone;
	}

	public boolean isDevelopmentPhone() {
		return developmentPhone;
	}

	public void setDevelopmentPhone(boolean developmentPhone) {
		this.developmentPhone = developmentPhone;
	}

	public boolean isAiCustomer() {
		return aiCustomer;
	}

	public void setAiCustomer(boolean aiCustomer) {
		this.aiCustomer = aiCustomer;
	}

	public boolean isActiveCustomer() {
		return activeCustomer;
	}

	public void setActiveCustomer(boolean activeCustomer) {
		this.activeCustomer = activeCustomer;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
