/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.JiraWebHookMessage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import utils.JsonUtils;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = JiraWebhookRestController.class)
public class JiraWebhookRestControllerTest {

	@Autowired
	private JiraWebhookRestController underTest;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testReceiveMessage_MVC_post() throws Exception {
		// given
		JiraWebHookMessage data = new JiraWebHookMessage();
		// when
		mockMvc.perform(post("/jirahook/receive")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(data, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testReceiveMessage() throws Exception {
		// given
		JiraWebHookMessage data = new JiraWebHookMessage();
		// when
		underTest.receiveMessage(data);
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

}
