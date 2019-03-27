/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.EmailAddress;
import artistry.repositories.EmailAddressRepository;
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
@ContextConfiguration(classes = EmailAddressRestController.class)
public class EmailAddressRestControllerTest {

	@Autowired
	private EmailAddressRestController underTest;

	@MockBean
	private EmailAddressRepository emailRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testDelete_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/emailaddress/delete/{id}")
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
		mockMvc.perform(delete("/emailaddress/deleteall")
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
		MvcResult actual = mockMvc.perform(get("/emailaddress/getall")
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
		MvcResult actual = mockMvc.perform(get("/emailaddress/getbyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreate_MVC_post() throws Exception {
		// given
		EmailAddress email = new EmailAddress();
		// when
		MvcResult actual = mockMvc.perform(post("/emailaddress/new")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(email, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdate_MVC_post() throws Exception {
		// given
		EmailAddress email = new EmailAddress();
		// when
		MvcResult actual = mockMvc.perform(post("/emailaddress/update")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(email, true))
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
		Iterable<EmailAddress> actual = underTest.getAll();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllById() throws Exception {
		// given
		Long id = 0L;
		// when
		Optional<EmailAddress> actual = underTest.getAllById(id);
		// then
		assertNotNull(actual);
	}

}
