/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.services.ArtistryCsvReader;
import artistry.utils.DownloadService;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = GeoImportRestController.class)
public class GeoImportRestControllerTest {

	@Autowired
	private GeoImportRestController underTest;

	@MockBean
	private ArtistryCsvReader csvReader;

	@MockBean
	private DownloadService downloader;

	private MockMvc mockMvc;

	@Before
	public void setupTest() {
		// prepare test
		this.mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
	}


	@Test
	public void testImportData_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/geo/import")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testImportDataByCode_MVC_get() throws Exception {
		// given
		String code = "code";
		// when
		MvcResult actual = mockMvc.perform(get("/geo/importbycode?code="+code)
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testImportDataByCity_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/geo/importcities")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testSetup_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/geo/setup")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testImportData() throws Exception {
		// given
		// when
		String actual = underTest.importData();
		// then
		assertEquals("", actual);
	}

	@Test
	public void testImportDataByCity() throws Exception {
		// given
		// when
		String actual = underTest.importDataByCity();
		// then
		assertEquals("", actual);
	}

	@Test
	public void testImportDataByCode() throws Exception {
		// given
		String code = "code";
		// when
		String actual = underTest.importDataByCode(code);
		// then
		assertEquals("", actual);
	}

	@Test
	public void testSetup() throws Exception {
		// given
		// when
		String actual = underTest.setup();
		// then
		assertEquals("", actual);
	}

}
