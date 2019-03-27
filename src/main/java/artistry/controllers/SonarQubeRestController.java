package artistry.controllers;

import artistry.models.SonarQubeCoverageReport;
import artistry.repositories.SonarQubeCoverageReportRepository;
import artistry.services.SonarQubeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@Description("Controller to manage sonarqube")
@RequestMapping("/sonar")
public class SonarQubeRestController {

	static final Logger log = LoggerFactory.getLogger(SonarQubeRestController.class);

	@Autowired
	private SonarQubeService sonarService;

	@Autowired
	private SonarQubeCoverageReportRepository srepo;

	@RequestMapping(value = "/getartifact/{artifact}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public SonarQubeCoverageReport getAllById(@PathVariable("artifact") String artifact) {
		SonarQubeCoverageReport data = sonarService.getCoverage(artifact);
		srepo.save(data);
		return data;
	}

}
