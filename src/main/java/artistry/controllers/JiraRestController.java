package artistry.controllers;

import artistry.models.*;
import artistry.services.JiraService;
import artistry.services.RapidviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Configuration
@RestController
@Description("Controller to manage jira")
@RequestMapping("/jira")
class JiraRestController {

	static final Logger log = LoggerFactory.getLogger(JiraRestController.class);

	@Autowired
	private JiraService jira;

	@Autowired
	private RapidviewService rapidview;

	@RequestMapping(value = "/getbyteamid", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public BoardEntry getByTeamId(@RequestParam("teamid") int teamid) {
		return jira.getBoard(teamid);
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public RapidView getAll() {
		RapidView views = rapidview.getRapidViews();
		rapidview.saveViews(views);
		return views;
	}

	@RequestMapping(value = "/getissuetypes", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public List<IssueType> getIssueTypes() throws IOException {
		return jira.getIssueTypes();
	}

	@RequestMapping(value = "/getteambacklog", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public JiraBacklog getBacklogByTeamId(@RequestParam("teamid") int teamid) {
		return jira.getBacklog(teamid);
	}

	@RequestMapping(value = "/getteamepics", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public JiraEpics getEpicsByTeamId(@RequestParam("teamid") int teamid) {

		return jira.getTeamEpics(teamid);
	}

	@RequestMapping(value = "/getteamissueswithoutepic", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public JiraIssuesWithoutEpic getIssuesWithoutEpicsByTeamId(@RequestParam("teamid") int teamid) {
		return jira.getTeamIssuesWithoutEpics(teamid);
	}

	/**
	 * Projects
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getprojects", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public JiraProjects getProjects() {
		return jira.getProjects();
	}

	/**
	 * Users
	 */
	@RequestMapping(value = "/getuserbyusername", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public JiraUser getUserByUsername(@RequestParam("username") String username) {
		return jira.getUserByUsername(username);
	}

	/**
	 * Web hooks
	 * 
	 * @param hook
	 * @return
	 * @link https://developer.atlassian.com/server/jira/platform/webhooks/
	 */
	@RequestMapping(value = "/createwebhook", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String newWebhook(@RequestBody JiraWebhook hook) {
		return jira.createWebhook(hook);
	}

	@RequestMapping(value = "/deletewebhook/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String deleteWebhook(@PathVariable("id") int id) {
		return jira.deleteWebhook(id);
	}

	@RequestMapping(value = "/getallwebhooks", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String getAllWebhooks() {
		return jira.getAllWebhooks();
	}

	@RequestMapping(value = "/getwebhook/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String queryWebhookById(@PathVariable("id") int id) {
		return jira.getWebhookById(id);
	}

	@RequestMapping(value = "/updatewebhook/{id}", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String updateWebhookById(@PathVariable("id") int id, @RequestBody JiraWebhook hook) {
		return jira.updateWebhookById(id, hook);
	}

}