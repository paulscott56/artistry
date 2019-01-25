package artistry.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
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

import artistry.models.Completed;
import artistry.models.Estimated;
import artistry.models.SprintEntry;
import artistry.models.VelocityEntry;
import artistry.repositories.SprintRepository;
import artistry.repositories.VelocityRepository;
import artistry.utils.JiraUtils;

@Service
public class SprintService {

	static final Logger log = LoggerFactory.getLogger(SprintService.class);

	@Value("${jira.url}")
	private String jiraUrl;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private JiraUtils utils;

	@Autowired
	private SprintRepository srepo;

	@Autowired
	private VelocityRepository vrepo;

	public JSONObject getSprints(String teamid) throws JSONException {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);

		final ResponseEntity<String> data = rt.exchange(
				jiraUrl + "/rest/greenhopper/latest/rapid/charts/velocity.json?rapidViewId=" + teamid, HttpMethod.GET,
				entity, String.class);
		return new JSONObject(data.getBody());
	}

	public List<SprintEntry> parseSprints(JSONObject sprints, String teamid) throws JSONException {
		List<SprintEntry> sprintList = new ArrayList<>();

		JSONArray sprintarr = sprints.getJSONArray("sprints");
		for (int x = 0; x < sprintarr.length(); x++) {
			JSONObject sprintdata = sprintarr.getJSONObject(x);
			SprintEntry entry = new SprintEntry();
			entry.setSequence(sprintdata.getInt("sequence"));
			entry.setLinkedPageCount(sprintdata.getInt("linkedPagesCount"));
			if (sprintdata.has("goal")) {
				entry.setGoal(sprintdata.getString("goal"));
			}
			entry.setName(sprintdata.getString("name"));
			entry.setJiraId(sprintdata.getInt("id"));
			entry.setState(sprintdata.getString("state"));
			entry.setRapidviewId(teamid);

			// the sprint is linked to all teams, so the jiraID is then shared.
			// @TODO: find a good way to check if this record is unique
			// if (!srepo.existsByJiraId(sprintdata.getInt("id"))) {
			srepo.save(entry);
			// }
			sprintList.add(entry);

		}

		return sprintList;
	}

	public List<VelocityEntry> parseVelocities(JSONObject sprints, String teamid) throws JSONException {
		List<VelocityEntry> velocityList = new ArrayList<>();
		JSONObject velocitystats = sprints.getJSONObject("velocityStatEntries");
		Iterator<String> keys = velocitystats.keys();
		while (keys.hasNext()) {
			String key = keys.next();
			if (velocitystats.get(key) instanceof JSONObject) {
				JSONObject velobj = velocitystats.getJSONObject(key);
				VelocityEntry ventry = new VelocityEntry();

				Completed c = new Completed();
				c.setValue(velobj.getJSONObject("completed").getDouble("value"));
				c.setText(velobj.getJSONObject("completed").getString("text"));

				Estimated e = new Estimated();
				e.setText(velobj.getJSONObject("estimated").getString("text"));
				e.setValue(velobj.getJSONObject("estimated").getDouble("value"));

				ventry.setCompleted(c);
				ventry.setEstimated(e);

				ventry.setJiraId(Integer.valueOf(key));
				ventry.setRapidviewId(teamid);

				// the sprint is linked to all teams, so the jiraID is then shared.
				// @TODO: find a good way to check if this record is unique
				// if (!vrepo.existsByJiraId(key)) {
				vrepo.save(ventry);
				// }
				velocityList.add(ventry);
			}
		}
		return velocityList;

	}

	// public SprintEntry getTeamSprintDetail(String teamid, int sprintid) {
	// final Query query = new Query();
	// query.addCriteria(Criteria.where("rapidviewId").is(teamid).and("jiraId").is(sprintid));
	// return mt.findOne(query, SprintEntry.class);
	// }
}
