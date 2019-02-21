package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JiraUser {

	@Id
	@GeneratedValue
	private Long id;

	private String errorOrComment;
	private String self;
	private String key;
	private String accountId;
	private String name;
	private String emailAddress;
	private AvatarUrls avatarUrls;
	private String displayName;
	private boolean active;
	private String timeZone;
	private String locale;
	private JiraGroups groups;
	private JiraApplicationRoles applicationRoles;
	private String expand;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getErrorOrComment() {
		return errorOrComment;
	}

	public void setErrorOrComment(String errorOrComment) {
		this.errorOrComment = errorOrComment;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public AvatarUrls getAvatarUrls() {
		return avatarUrls;
	}

	public void setAvatarUrls(AvatarUrls avatarUrls) {
		this.avatarUrls = avatarUrls;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public JiraGroups getGroups() {
		return groups;
	}

	public void setGroups(JiraGroups groups) {
		this.groups = groups;
	}

	public JiraApplicationRoles getApplicationRoles() {
		return applicationRoles;
	}

	public void setApplicationRoles(JiraApplicationRoles applicationRoles) {
		this.applicationRoles = applicationRoles;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

}
