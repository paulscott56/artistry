package artistry.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.JiraWebHookMessage;

@Configuration
@RestController
@Description("Controller to receive messages from Jira webhooks")
@RequestMapping("/jirahook")
public class JiraWebhookRestController {

	static final Logger log = LoggerFactory.getLogger(JiraWebhookRestController.class);

	@RequestMapping(value = "/receive", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public void receiveMessage(@RequestBody JiraWebHookMessage data) {
		log.debug(data.toString());

	}
}
