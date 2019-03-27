/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.Company;
import artistry.models.ImplementationTeam;
import artistry.models.PersonTeamObject;
import artistry.repositories.CompanyRepository;
import artistry.repositories.ImplementationTeamRepository;
import java.nio.charset.*;
import java.util.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.io.*;
import org.json.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import utils.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = ImplementationTeamRestController.class)
public class ImplementationTeamRestControllerTest {

	@Autowired
	private ImplementationTeamRestController underTest;

	@MockBean
	private CompanyRepository companyRepo;

	@MockBean
	private ImplementationTeamRepository teamRepo;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testDeleteLargeSolution_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/team/delete/{id}")
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
		MvcResult actual = mockMvc.perform(get("/team/getall")
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
		MvcResult actual = mockMvc.perform(get("/team/getbyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetByName_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/team/getbyname/{name}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateTeam_MVC_post() throws Exception {
		// given
		ImplementationTeam team = new ImplementationTeam();
		// when
		MvcResult actual = mockMvc.perform(post("/team/new")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(team, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdateScrumMaster_MVC_post() throws Exception {
		// given
		PersonTeamObject personteam = new PersonTeamObject();
		// when
		MvcResult actual = mockMvc.perform(post("/team/updatescrummaster")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(personteam, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

}
