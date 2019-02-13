package artistry.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import artistry.models.BoardConfig;
import artistry.models.BoardEntry;
import artistry.models.BoardLocation;
import artistry.models.IssueType;
import artistry.models.JiraBacklog;
import artistry.models.JiraEpics;
import artistry.models.JiraWebhook;
import artistry.repositories.BoardRepository;
import artistry.repositories.IssueTypeRepository;
import artistry.repositories.JiraBacklogRepository;
import artistry.utils.JiraUtils;

@Service
public class JiraService {

	static final Logger log = LoggerFactory.getLogger(JiraService.class);

	@Value("${jira.url}")
	private String jiraUrl;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private JiraUtils utils;

	@Autowired
	private BoardRepository brepo;

	@Autowired
	private IssueTypeRepository issueTypeRepo;

	@Autowired
	private JiraBacklogRepository blrepo;

	public BoardEntry getBoard(int teamid) throws JSONException {
		Optional<BoardEntry> exists = brepo.findOneByJiraId(teamid);
		try {
			if (!exists.isPresent()) {
				BoardEntry board = new BoardEntry();
				final HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
				headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
				final HttpEntity<String> entity = new HttpEntity<>(null, headers);

				final ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/agile/latest/board/" + teamid,
						HttpMethod.GET, entity, String.class);
				JSONObject json = new JSONObject(data.getBody());
				board.setJiraId(json.getInt("id"));
				board.setName(json.getString("name"));
				board.setUrl(json.getString("self"));
				board.setType(json.getString("type"));
				JSONObject bloc = json.getJSONObject("location");
				BoardLocation boardloc = new BoardLocation();
				boardloc.setAvatarURI(bloc.optString("avatarURI"));
				boardloc.setDisplayName(bloc.optString("displayName"));
				boardloc.setName(bloc.optString("name"));
				boardloc.setProjectId(bloc.optString("projectId"));
				boardloc.setProjectKey(bloc.optString("projectKey"));
				boardloc.setProjectName(bloc.optString("projectName"));
				boardloc.setProjectTypeKey(bloc.optString("projectTypeKey"));
				board.setLocation(boardloc);
				board.setBoardConfig(getBoardConfig(teamid));
				// JiraBacklog bl = getBacklog(teamid);
				// board.setBacklog(bl);
				brepo.save(board);
				return board;
			} else {
				Optional<BoardEntry> boarddata = brepo.findOneByJiraId(Integer.valueOf(teamid));
				if (boarddata.isPresent()) {
					return boarddata.get();
				}
			}
		} catch (HttpClientErrorException e) {
			log.error(e.getLocalizedMessage());
			BoardEntry b = new BoardEntry();
			b.setCommentOrError("Board not found! Please check teamID");
			return b;
		}
		return null;

	}

	public String createWebhook(JiraWebhook hook) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<JiraWebhook> entity = new HttpEntity<>(hook, headers);
		try {
			ResponseEntity<String> data = rt.postForEntity(jiraUrl + "/rest/webhooks/1.0/webhook", entity,
					String.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			// e.printStackTrace();
			return e.getLocalizedMessage();
		}
	}

	public String deleteWebhook(int id) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<Integer> entity = new HttpEntity<>(id, headers);
		try {
			ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/webhooks/1.0/webhook/" + id, HttpMethod.DELETE,
					entity, String.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			return e.getLocalizedMessage();
		}
	}

	public String getAllWebhooks() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		try {
			ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/webhooks/1.0/webhook", HttpMethod.GET, entity,
					String.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			return e.getLocalizedMessage();
		}
	}

	public String getWebhookById(int id) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		try {
			ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/webhooks/1.0/webhook/" + id, HttpMethod.GET,
					entity, String.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			return e.getLocalizedMessage();
		}
	}

	public String updateWebhookById(int id, JiraWebhook hook) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<JiraWebhook> entity = new HttpEntity<>(hook, headers);
		try {
			ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/webhooks/1.0/webhook/" + id, HttpMethod.PUT,
					entity, String.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			return e.getLocalizedMessage();
		}
	}

	public void createBoard() {

	}

	public BoardConfig getBoardConfig(int id) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<BoardConfig> entity = new HttpEntity<>(null, headers);
		try {
			ResponseEntity<BoardConfig> data = rt.exchange(
					jiraUrl + "/rest/agile/latest/board/" + id + "/configuration", HttpMethod.GET, entity,
					BoardConfig.class);
			return data.getBody();
		} catch (HttpClientErrorException e) {
			BoardConfig cf = new BoardConfig();
			cf.setErrorOrComment(e.getLocalizedMessage());
			return cf;
		}
	}

	public List<IssueType> getIssueTypes() throws JsonParseException, JsonMappingException, IOException {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);
		try {
			ObjectMapper mapper = new ObjectMapper();
			ResponseEntity<String> data = rt.exchange(jiraUrl + "/rest/api/latest/issuetype", HttpMethod.GET, entity,
					String.class);
			String types = data.getBody();
			List<IssueType> listtypes = mapper.readValue(types, new TypeReference<List<IssueType>>() {
			});
			for (IssueType t : listtypes) {
				// check if it exists first
				Optional<IssueType> it = issueTypeRepo.findByJiraId(t.getJiraId());
				if (!it.isPresent()) {
					issueTypeRepo.save(t);
				}
			}
			return listtypes;
		} catch (HttpClientErrorException e) {
			List<IssueType> errlist = new ArrayList<>();
			IssueType i = new IssueType();
			i.setErrorOrWarning(e.getLocalizedMessage());
			errlist.add(i);
			return errlist;
		}
	}

	public JiraBacklog getBacklog(int teamid) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<JiraBacklog> entity = new HttpEntity<>(null, headers);
		try {
			final ResponseEntity<JiraBacklog> data = rt.exchange(
					jiraUrl + "/rest/agile/latest/board/" + teamid + "/backlog?maxResults=200", HttpMethod.GET, entity,
					JiraBacklog.class);
			JiraBacklog backlog = data.getBody();
			return blrepo.save(backlog);
		} catch (Exception e) {
			JiraBacklog bl = new JiraBacklog();
			bl.setErrorOrComment(e.getLocalizedMessage());
			// e.printStackTrace();
			return bl;
		}
	}

	public JiraEpics getTeamEpics(int teamid) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<JiraBacklog> entity = new HttpEntity<>(null, headers);
		try {
			final ResponseEntity<JiraEpics> data = rt.exchange(
					jiraUrl + "/rest/agile/latest/board/" + teamid + "/epic?maxResults=200", HttpMethod.GET, entity,
					JiraEpics.class);
			JiraEpics epics = data.getBody();
			return epics;
		} catch (Exception e) {
			JiraEpics bl = new JiraEpics();
			bl.setErrorOrComment(e.getLocalizedMessage());
			// e.printStackTrace();
			return bl;
		}

	}

	// public String makePostRequestToCreateBoard(AgileBoard agileBoard, Long[]
	// projects) {
	// String resource = "/rest/greenhopper/1.0/rapidview/create/presets";
	// Gson json = new Gson();
	// DataForBoardRequest dataForBoardRequest = new DataForBoardRequest();
	// dataForBoardRequest.setName(agileBoard.getBoardName());
	// String projectId[] = new String[projects.length];
	// for (int i = 0; i < projects.length; i++) {
	// projectId[i] = String.valueOf(projects[i]);
	// }
	// dataForBoardRequest.setProjectIds(projectId);
	// dataForBoardRequest.setPreset(agileBoard.getBoardType());
	// String stringObject = json.toJson(dataForBoardRequest);
	//
	//// String requestUrl = String.format("%s%s", baseUrl, resource.getUrl());
	//// WebResource webResource = jerseyClient.resource(requestUrl);
	//// String postAnswer = webResource.header("Authorization", "Basic " +
	// authString).type(MediaType.APPLICATION_JSON)
	//// .accept(MediaType.APPLICATION_JSON).entity(stringObject).post(String.class);
	//
	// return postAnswer;
	//
	// }

}
