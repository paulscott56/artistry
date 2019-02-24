package artistry.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
class RestTemplateConfiguration {

	private static final Logger log = LoggerFactory.getLogger(RestTemplateConfiguration.class);

	@Bean
	@Primary
	public RestTemplate getRestClient() {
		final RestTemplate restClient = new RestTemplate(
				new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
		restClient.setInterceptors(Collections.singletonList((request, body, execution) -> {
			log.debug("Intercepting... " + request);
			return execution.execute(request, body);
		}));
		return restClient;
	}

}
