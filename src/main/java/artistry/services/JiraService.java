package artistry.services;

import java.util.Collections;
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

import artistry.models.BoardEntry;
import artistry.models.BoardLocation;
import artistry.repositories.BoardRepository;
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

	public Iterable<BoardEntry> getAllBoards() {
		// TODO: need to query jira rest here to get all boards also, add them to the
		// db, then return
		return brepo.findAll();
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
