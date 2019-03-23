package artistry.services;

import artistry.models.ConfluenceSpaces;
import artistry.models.NewConfluencePage;
import artistry.utils.JiraUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class ConfluenceService {

	static final Logger log = LoggerFactory.getLogger(JiraService.class);

	@Value("${jira.url}")
	private String jiraUrl;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private JiraUtils utils;

	public ConfluenceSpaces getSpaces() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<ConfluenceSpaces> entity = new HttpEntity<>(null, headers);
		final ResponseEntity<ConfluenceSpaces> data = rt.exchange(jiraUrl + "/wiki/rest/api/space", HttpMethod.GET, entity,
				ConfluenceSpaces.class);
		return data.getBody();
	}

	public String getSpaceByKey(String key) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		final ResponseEntity<String> data = rt.exchange(jiraUrl + "/wiki/rest/api/space/" + key + "/", HttpMethod.GET,
				entity, String.class);
		return data.getBody();
	}

	public String getSpaceContent(String key) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		final ResponseEntity<String> data = rt.exchange(jiraUrl + "/wiki/rest/api/space/" + key + "/content",
				HttpMethod.GET, entity, String.class);
		return data.getBody();
	}

	public String getDocumentById(String id) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		final ResponseEntity<String> data = rt.exchange(
				jiraUrl + "/wiki/rest/api/content/" + id + "/?expand=body.storage", HttpMethod.GET, entity,
				String.class);
		return data.getBody();
	}

	public NewConfluencePage createPage(NewConfluencePage page) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		final ResponseEntity<String> data = rt.exchange(jiraUrl + "/wiki/rest/api/content/", HttpMethod.POST, entity,
				String.class);
		return page;
	}

}
