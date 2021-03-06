/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.Document;
import artistry.repositories.DocumentRepository;
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
@ContextConfiguration(classes = DocumentRestController.class)
public class DocumentRestControllerTest {

	@Autowired
	private DocumentRestController underTest;

	@MockBean
	private DocumentRepository docRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testDeleteDocument_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/document/delete/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testDeleteAll_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/document/deleteall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGetAll_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/document/getall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAllById_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/document/getbyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateDocument_MVC_post() throws Exception {
		// given
		Document document = new Document();
		// when
		MvcResult actual = mockMvc.perform(post("/document/new")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(document, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdateDocument_MVC_post() throws Exception {
		// given
		Document document = new Document();
		// when
		MvcResult actual = mockMvc.perform(post("/document/update")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(document, true))
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
		Iterable<Document> actual = underTest.getAll();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllById() throws Exception {
		// given
		Long id = 0L;
		// when
		Optional<Document> actual = underTest.getAllById(id);
		// then
		assertNotNull(actual);
	}

}
