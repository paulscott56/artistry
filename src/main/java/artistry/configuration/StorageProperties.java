package artistry.configuration;

import artistry.utils.StorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class StorageProperties {

	@Value("${artistry.data.directory}")
	private static String location;

	public StorageProperties() {
		super();
		File flocation = new File("/tmp/artistry/data/");
		if (!flocation.exists()) {
			flocation.mkdirs();
			location = flocation.toString();
		} else {
			location = flocation.toString();
		}
	}

	/**
	 * Folder location for storing files
	 */
	public static String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		StorageProperties.location = location;
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			// storageService.deleteAll();
			storageService.init();
		};
	}

}