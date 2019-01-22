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

import artistry.models.train.Enterprise;
import artistry.models.train.KPI;
import artistry.models.train.StrategicTheme;
import artistry.repositories.EnterpriseRepository;
import artistry.repositories.KpiRepository;
import artistry.repositories.StrategicThemeRepository;

@Configuration
@RestController
@Description("Controller to manage entreprises")
@RequestMapping("/enterprise")
public class EnterpriseRestController {

	static final Logger log = LoggerFactory.getLogger(EnterpriseRestController.class);

	@Autowired
	private EnterpriseRepository enterRepo;

	@Autowired
	private KpiRepository kpiRepo;

	@Autowired
	private StrategicThemeRepository themeRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Enterprise> getAll() {
		return enterRepo.findAll();
	}

	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Enterprise> getAllByName(@PathVariable("name") String name) {
		return enterRepo.findByEnterpriseName(name);
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Enterprise> getAllById(@PathVariable("id") Long id) {
		return enterRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
		Enterprise savedenterprise = enterRepo.save(enterprise);
		return savedenterprise;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Enterprise updateEnterprise(@RequestBody Enterprise enterprise) {
		Enterprise savedenterprise = enterRepo.save(enterprise);
		return savedenterprise;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteEnterprise(@PathVariable("id") Long id) {
		Optional<Enterprise> enterprise = enterRepo.findById(id);
		if (enterprise.isPresent()) {
			enterRepo.delete(enterprise.get());
		}
	}

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

	/**
	 * Strategic themes
	 */
	@RequestMapping(value = "/newtheme", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private StrategicTheme createTheme(@RequestBody StrategicTheme theme) {
		StrategicTheme savedtheme = themeRepo.save(theme);
		return savedtheme;
	}

	@RequestMapping(value = "/getallthemes", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<StrategicTheme> getAllThemess() {
		Iterable<StrategicTheme> data = themeRepo.findAll();
		return data;
	}

	@RequestMapping(value = "/updatetheme", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private StrategicTheme updateTheme(@RequestBody StrategicTheme theme) {
		StrategicTheme savedtheme = themeRepo.save(theme);
		return savedtheme;
	}

	@RequestMapping(value = "/deletetheme/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteTheme(@PathVariable("id") Long id) {
		Optional<StrategicTheme> theme = themeRepo.findById(id);
		if (theme.isPresent()) {
			themeRepo.delete(theme.get());
		}
	}

	@RequestMapping(value = "/getthemebyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<StrategicTheme> getThemeById(@PathVariable("id") Long id) {
		return themeRepo.findById(id);
	}

}
