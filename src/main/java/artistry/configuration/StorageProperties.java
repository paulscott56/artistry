package artistry.configuration;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import artistry.utils.StorageService;

@Configuration
public class StorageProperties {

	@Value("${artistry.data.directory}")
	private static String location;

	public StorageProperties() throws IOException {
		super();
		File flocation = new File("/tmp/artistry/data"); // ResourceUtils.getFile("classpath:csv").toString();
		if (!flocation.exists()) {
			flocation.mkdirs();
			// flocation.createNewFile();
			location = flocation.toString();
		} else {
			location = flocation.toString();
		}
	}

	/**
	 * Folder location for storing files
	 */
	// private static String location;
	// //getClass().getResourceAsStream("csv/").toString();
	// //ClassLoader.getSystemClassLoader().getResource("csv/").toString();

	public static String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			// storageService.deleteAll();
			storageService.init();
		};
	}

}