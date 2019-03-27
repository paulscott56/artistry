/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.enums.Role;
import artistry.exceptions.StorageFileNotFoundException;
import artistry.models.Country;
import artistry.models.Person;
import artistry.models.PersonRole;
import artistry.repositories.CountryRepository;
import artistry.repositories.PersonRepository;
import artistry.repositories.RolesRepository;
import artistry.services.ArtistryCsvReader;
import artistry.utils.StorageService;
import java.io.IOException;
import java.nio.charset.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.io.*;
import org.apache.commons.io.FilenameUtils;
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
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
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
@ContextConfiguration(classes = PersonRestController.class)
public class PersonRestControllerTest {

	@Autowired
	private PersonRestController underTest;

	@MockBean
	private CountryRepository countryRepo;

	@MockBean
	private ArtistryCsvReader csvReader;

	@MockBean
	private PersonRepository personRepo;

	@MockBean
	private RolesRepository rolesRepo;

	@MockBean
	private StorageService storageService;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testActivatePerson_MVC_post() throws Exception {
		// given
		Person person = new Person();
		// when
		MvcResult actual = mockMvc.perform(post("/person/activate")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(person, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateRole_MVC_post() throws Exception {
		// given
		PersonRole role = new PersonRole();
		// when
		MvcResult actual = mockMvc.perform(post("/person/createrole")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(role, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testDeactivatePerson_MVC_post() throws Exception {
		// given
		Person person = new Person();
		// when
		MvcResult actual = mockMvc.perform(post("/person/deactivate")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(person, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testDeleteAll_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/person/deleteall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGenerateDemoUsers_MVC_get() throws Exception {
		// given
		// when
		mockMvc.perform(get("/person/generatedemopeople")
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
		MvcResult actual = mockMvc.perform(get("/person/getall")
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
		MvcResult actual = mockMvc.perform(get("/person/getbyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetByUsername_MVC_get() throws Exception {
		// given
		String username = "username";
		// when
		MvcResult actual = mockMvc.perform(get("/person/getbyusername?username="+username)
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreatePerson_MVC_post() throws Exception {
		// given
		Person person = new Person();
		// when
		MvcResult actual = mockMvc.perform(post("/person/new")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(person, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateBaseRoles_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/person/setuproles")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdatePerson_MVC_post() throws Exception {
		// given
		Person person = new Person();
		// when
		MvcResult actual = mockMvc.perform(post("/person/update")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(person, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testHandleFileUpload_MVC_post() throws Exception {
		// given
		MultipartFile file = new MockMultipartFile("fileName", "content".getBytes());
		// when
		MvcResult actual = mockMvc.perform(post("/person/upload")
				.param("file", file)
)
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGenerateDemoUsers() throws Exception {
		// given
		// when
		underTest.generateDemoUsers();
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testHandleFileUpload() throws Exception {
		// given
		MultipartFile file = new MockMultipartFile("fileName", "content".getBytes());
		// when
		String actual = underTest.handleFileUpload(file);
		// then
		assertEquals("", actual);
	}

	@Test
	public void testHandleStorageFileNotFound() throws Exception {
		// given
		StorageFileNotFoundException exc = mock(StorageFileNotFoundException.class);
		// when
		ResponseEntity<?> actual = underTest.handleStorageFileNotFound(exc);
		// then
		assertNotNull(actual);
	}

}
