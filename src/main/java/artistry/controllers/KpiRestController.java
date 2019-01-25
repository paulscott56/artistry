package artistry.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import artistry.models.KPI;
import artistry.repositories.KpiRepository;

@Configuration
@RestController
@Description("Controller to manage KPI's")
@RequestMapping("/kpi")
public class KpiRestController {
	
	static final Logger log = LoggerFactory.getLogger(KpiRestController.class);
	
	@Autowired
	private KpiRepository kpiRepo;

	/**
	 * KPI Section
	 * 
	 * @param kpi
	 * @return
	 */
	@RequestMapping(value = "/newkpi", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private KPI createKPI(@RequestBody KPI kpi) {
		KPI savedkpi = kpiRepo.save(kpi);
		return savedkpi;
	}

	@RequestMapping(value = "/getallkpis", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<KPI> getAllKPIs() {
		Iterable<KPI> data = kpiRepo.findAll();
		return data;
	}

	@RequestMapping(value = "/updatekpi", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private KPI updateKPI(@RequestBody KPI kpi) {
		KPI savedkpi = kpiRepo.save(kpi);
		return savedkpi;
	}

	@RequestMapping(value = "/deletekpi/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteKpi(@PathVariable("id") Long id) {
		Optional<KPI> kpi = kpiRepo.findById(id);
		if (kpi.isPresent()) {
			kpiRepo.delete(kpi.get());
		}
	}

	@RequestMapping(value = "/getkpibyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<KPI> getKPIById(@PathVariable("id") Long id) {
		return kpiRepo.findById(id);
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		kpiRepo.deleteAll();

	}
}
