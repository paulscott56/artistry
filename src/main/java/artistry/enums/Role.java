package artistry.enums;

public enum Role {

	SCRUM_MASTER("SM", "Scrum master"), 
	DEVELOPER("DEV", "Developer"), 
	AGILE_TEAM_MEMBER("ATM", "Agile Team Member"), 
	PRODUCT_OWNER("PO", "Product Owner"), 
	RTE("RTE", "Release Train Engineer"), 
	STE("STE", "Solution Train Engineer"), 
	PRODUCT_MANAGER("PM", "Product Manager"), 
	TESTER("TST", "Tester"), 
	BUSINESS_OWNER("BO", "Business Owner"), 
	CUSTOMER("CUST", "Customer"), 
	SOLUTION_MANAGER("SM", "Solution Manager"), 
	SUPPLIER("SUPP", "Supplier"), 
	PORTFOLIO_MANAGER("PORTMAN", "Portfolio Manager"), 
	EPIC_OWNER("EO", "Epic Owner"), 
	ENTERPRISE_ARCHITECT("EA", "Enterprise Architect"), 
	UX("UX", "User Experience Engineer"), 
	AGILE_LEADER("AL", "Agile Leader"), 
	AGILE_COACH("AC", "Agile Coach"), 
	DEVELOPMENT_MANAGER("DM", "Development Manager"), 
	TEAM_LEAD("TL", "Team Lead"), 
	TRANSLATOR("TRANS", "Translation Specialist"), 
	MOBILE_IOS_DEV("IOS", "IOS Mobile Developer"), 
	MOBILE_ANDROID_DEV("AND", "Android Mobile Developer (Java)"),
	MOBILE_ANDROID_KOT_DEV("ANK", "Android Mobile Develoer (Kotlin)"),
	CTO("CTO", "Chief Technical Officer"), 
	CEO("CEO", "Chief Executive Officer"), 
	DEVOPS_ENGINEER("DEVOPS", "DevOps Engineer"), 
	MARKETING("MARK", "Marketing team member"), 
	ANALYTICS("ANA", "Analytics Engineer"), 
	REPORTING("REP", "Reporting Engineer"), 
	GIS("GIS", "Geographical Information Systems Engineer"), 
	CONSULTANT("CONS", "Specialist Consultant"),
	DBA("DBA", "Database Administrator");

	private final String key;
	private final String value;

	Role(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
