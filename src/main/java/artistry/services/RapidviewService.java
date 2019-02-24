package artistry.services;

import artistry.models.RapidView;
import artistry.models.RapidviewEntry;
import artistry.repositories.RapidviewRepository;
import artistry.utils.JiraUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@Service
public class RapidviewService {

	@Value("${jira.url}")
	private String jiraUrl;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private RapidviewRepository repo;

	@Autowired
	private JiraUtils utils;

	public RapidView getRapidViews() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic " + utils.makeBase64Credentials());
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);

		final ResponseEntity<RapidView> data = rt.exchange(jiraUrl + "/rest/greenhopper/latest/rapidview",
				HttpMethod.GET, entity, RapidView.class);
		return data.getBody();
	}

	public void saveViews(RapidView views) {
		Set<RapidviewEntry> viewlist = views.getViews();
		for (RapidviewEntry e : viewlist) {
			Optional<RapidviewEntry> data = repo.findOneByRapidviewId(String.valueOf(e.getId()));
			if (!data.isPresent()) {
				RapidviewEntry record = new RapidviewEntry();
				record.setRapidviewId(String.valueOf(e.getId()));
				record.setCanEdit(e.isCanEdit());
				record.setKanPlanEnabled(e.isKanPlanEnabled());
				record.setName(e.getName());
				record.setShowDaysInColumn(e.isShowDaysInColumn());
				record.setShowEpicAsPanel(e.isShowEpicAsPanel());
				record.setSprintSupportEnabled(e.isSprintSupportEnabled());
				record.setParentProjectId(e.getParentProjectId());
				record.setSimpleBoard(e.isSimpleBoard());
				record.setSavedFilterId(e.getSavedFilterId());
				repo.save(record);
			} else {
				Optional<RapidviewEntry> record = repo.findOneByRapidviewId(String.valueOf(e.getId()));
				if (record.isPresent()) {
					RapidviewEntry rec = record.get();
					rec.setId(rec.getId());
					rec.setCanEdit(e.isCanEdit());
					rec.setKanPlanEnabled(e.isKanPlanEnabled());
					rec.setName(e.getName());
					rec.setShowDaysInColumn(e.isShowDaysInColumn());
					rec.setShowEpicAsPanel(e.isShowEpicAsPanel());
					rec.setSprintSupportEnabled(e.isSprintSupportEnabled());
					rec.setParentProjectId(e.getParentProjectId());
					rec.setSimpleBoard(e.isSimpleBoard());
					rec.setSavedFilterId(e.getSavedFilterId());
					repo.save(rec);
				}
			}
		}
	}

	public RapidviewEntry getViewById(String id) {
		Optional<RapidviewEntry> data = repo.findOneByRapidviewId(id);
        return data.orElse(null);

    }

	// public List<RapidviewEntry> getViewByFuzzyName(String name) {
	// final Query query = new Query();
	// query.addCriteria(
	// Criteria.where("name").regex(Pattern.compile(name, Pattern.CASE_INSENSITIVE |
	// Pattern.UNICODE_CASE)));
	// return mt.find(query, RapidviewEntry.class);
	// }
}
