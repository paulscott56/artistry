package artistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableCaching
@Transactional
public class ArtistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtistryApplication.class, args);
	}
}
