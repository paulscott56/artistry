package artistry.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.BoardEntry;
import artistry.models.JiraWebhook;
import artistry.models.RapidView;
import artistry.services.JiraService;
import artistry.services.RapidviewService;

@Configuration
@RestController
@Description("Controller to manage jira")
@RequestMapping("/jira")
public class JiraRestController {

	static final Logger log = LoggerFactory.getLogger(JiraRestController.class);

	@Autowired
	private JiraService jira;

	@Autowired
	private RapidviewService rapidview;

	@RequestMapping(value = "/getbyteamid", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public BoardEntry getAll(@RequestParam("teamid") int teamid) {
		return jira.getBoard(teamid);
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public RapidView getAll() {
		RapidView views = rapidview.getRapidViews();
		rapidview.saveViews(views);
		return views;
	}

	/**
	 * Web hooks
	 * 
	 * @param hook
	 * @return
	 * @see https://developer.atlassian.com/server/jira/platform/webhooks/
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