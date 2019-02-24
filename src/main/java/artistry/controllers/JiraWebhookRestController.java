package artistry.controllers;

import artistry.models.JiraWebHookMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@Description("Controller to receive messages from Jira webhooks")
@RequestMapping("/jirahook")
class JiraWebhookRestController {

	private static final Logger log = LoggerFactory.getLogger(JiraWebhookRestController.class);

	@RequestMapping(value = "/receive", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public void receiveMessage(@RequestBody JiraWebHookMessage data) {
		log.debug(data.toString());

	}
}
