package artistry.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.BoardEntry;
import artistry.services.JiraService;

@Configuration
@RestController
@Description("Controller to manage jira and confluence")
@RequestMapping("/jira")
public class JiraRestController {

	static final Logger log = LoggerFactory.getLogger(JiraRestController.class);

	@Autowired
	private JiraService jira;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public BoardEntry getAll(@RequestParam("teamid") int teamid) {
		return jira.getBoard(teamid);
	}

}
