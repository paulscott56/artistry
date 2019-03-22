package artistry.services;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import artistry.models.SonarQubeCoverageReport;

@Service
public class SonarQubeService {

	private static final Logger log = LoggerFactory.getLogger(SonarQubeService.class);

	@Value("${sonarqube.url}")
	private String sonarqubeUrl;

	@Autowired
	private RestTemplate rt;

	public SonarQubeCoverageReport getCoverage(String artifact) {
		log.info("Querying SonarQube for details of " + artifact);
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		final HttpEntity<String> entity = new HttpEntity<>(null, headers);

		final ResponseEntity<SonarQubeCoverageReport> data = rt.exchange(
				sonarqubeUrl + "/api/measures/component?metricKeys=coverage&componentKey=" + artifact, HttpMethod.GET,
				entity, SonarQubeCoverageReport.class);

		SonarQubeCoverageReport rep = data.getBody();
		rep.setName(artifact);
		return rep;
	}
}
