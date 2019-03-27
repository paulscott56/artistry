/** This class was generated by GenTest@Mobacar */
package artistry.controllers;

import artistry.models.KPI;
import artistry.repositories.KpiRepository;
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
@ContextConfiguration(classes = KpiRestController.class)
public class KpiRestControllerTest {

	@Autowired
	private KpiRestController underTest;

	@MockBean
	private KpiRepository kpiRepo;

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
		mockMvc.perform(delete("/kpi/deleteall")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testDeleteKpi_MVC_delete() throws Exception {
		// given
		// when
		mockMvc.perform(delete("/kpi/deletekpi/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				;
		// then
		// TODO add meaningful assert or verify(mock).method();
	}

	@Test
	public void testGetAllKPIs_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/kpi/getallkpis")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetKPIById_MVC_get() throws Exception {
		// given
		// when
		MvcResult actual = mockMvc.perform(get("/kpi/getkpibyid/{id}")
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testCreateKPI_MVC_post() throws Exception {
		// given
		KPI kpi = new KPI();
		// when
		MvcResult actual = mockMvc.perform(post("/kpi/newkpi")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(kpi, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testUpdateKPI_MVC_post() throws Exception {
		// given
		KPI kpi = new KPI();
		// when
		MvcResult actual = mockMvc.perform(post("/kpi/updatekpi")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(JsonUtils.objectToJSON(kpi, true))
				.accept("application/json;charset=UTF-8"))
				.andExpect(status().isOk())
				.andReturn();
		// then
		String contentAsString = actual.getResponse().getContentAsString();
		assertNotNull(contentAsString);
	}

	@Test
	public void testGetKPIById() throws Exception {
		// given
		Long id = 0L;
		// when
		Optional<KPI> actual = underTest.getKPIById(id);
		// then
		assertNotNull(actual);
	}

}
