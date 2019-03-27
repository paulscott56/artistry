/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.StrategicTheme;
import artistry.repositories.StrategicThemeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import utils.JsonUtils;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = StrategicThemeRestController.class)
public class StrategicThemeRestControllerTest {

	@Autowired
	private StrategicThemeRestController underTest;

	@MockBean
	private StrategicThemeRepository themeRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testDeleteAll_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/theme/deleteall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testDeleteTheme_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/theme/deletetheme/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGetAllThemess_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/theme/getallthemes")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetThemeById_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/theme/getthemebyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateTheme_MVC_post() throws Exception {
		// given
		StrategicTheme theme = new StrategicTheme();
		// when
		MvcResult actual = mockMvc.perform(post("/theme/newtheme")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(theme, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdateTheme_MVC_post() throws Exception {
		// given
		StrategicTheme theme = new StrategicTheme();
		// when
		MvcResult actual = mockMvc.perform(post("/theme/updatetheme")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(theme, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetThemeById() throws Exception {
		// given
		Long id = 0L;
		// when
		Optional<StrategicTheme> actual = underTest.getThemeById(id);
		// then
		assertNotNull(actual);
	}

}