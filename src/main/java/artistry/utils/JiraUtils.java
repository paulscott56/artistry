package artistry.utils;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JiraUtils {

	@Value("${jira.username}")
	private String jiraUser;

	@Value("${jira.password}")
	private String jiraPass;

	public String makeBase64Credentials() {
		final String plainCreds = jiraUser + ":" + jiraPass;
		final byte[] plainCredsBytes = plainCreds.getBytes();
		final byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		return new String(base64CredsBytes);
	}
}