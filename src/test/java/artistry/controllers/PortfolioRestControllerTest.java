/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.Portfolio;
import artistry.repositories.PortfolioRepository;
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
@ContextConfiguration(classes = PortfolioRestController.class)
public class PortfolioRestControllerTest {

	@Autowired
	private PortfolioRestController underTest;

	@MockBean
	private PortfolioRepository portRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testDeletePortfolio_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/portfolio/delete/{id}")
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
		MvcResult actual = mockMvc.perform(get("/portfolio/getall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetById_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/portfolio/getbyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetAllByName_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/portfolio/getbyname/{name}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreatePortfolio_MVC_post() throws Exception {
		// given
		Portfolio portfolio = new Portfolio();
		// when
		MvcResult actual = mockMvc.perform(post("/portfolio/new")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(portfolio, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdatePortfolio_MVC_post() throws Exception {
		// given
		Portfolio portfolio = new Portfolio();
		// when
		MvcResult actual = mockMvc.perform(post("/portfolio/update")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(portfolio, true))
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
		Iterable<Portfolio> actual = underTest.getAll();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetAllByName() throws Exception {
		// given
		String name = "name";
		// when
		Iterable<Portfolio> actual = underTest.getAllByName(name);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetById() throws Exception {
		// given
		Long id = 0L;
		// when
		Optional<Portfolio> actual = underTest.getById(id);
		// then
		assertNotNull(actual);
	}

}