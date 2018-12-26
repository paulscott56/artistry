package artistry.services;

import java.util.Collections;

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
import org.springframework.web.client.RestTemplate;

import artistry.models.jira.BoardEntry;
import artistry.repositories.BoardRepository;
import artistry.utils.JiraUtils;

@Service
public class BoardService {

	static final Logger log = LoggerFactory.getLogger(BoardService.class);

	@Value("${jira.url}")
	private String jiraUrl;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private JiraUtils utils;

	@Autowired
	BoardRepository brepo;

	public BoardEntry getBoard(String teamid) throws JSONException {
		boolean exists = brepo.existsByJiraId(Integer.valueOf(teamid));
		if (!exists) {
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
			brepo.save(board);
			return board;
		} else {
			return brepo.findOneByJiraId(Integer.valueOf(teamid));
		}

	}

}
