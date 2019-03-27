/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.ConfluenceSpaces;
import artistry.services.ConfluenceService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = ConfluenceRestController.class)
public class ConfluenceRestControllerTest {

	@Autowired
	private ConfluenceRestController underTest;

	@MockBean
	private ConfluenceService confluenceService;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testGetAll_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/confluence/getspaces")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAll() throws Exception {
		// given
		// when
		ConfluenceSpaces actual = underTest.getAll();
		// then
		assertNotNull(actual);
	}

}