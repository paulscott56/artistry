package artistry.configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import artistry.utils.StorageService;

@Configuration
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = ClassLoader.getSystemResource("csv/").toString();  //"upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Bean
    CommandLineRunner init(StorageService storageService) {
    	return (args) -> {
    		//storageService.deleteAll();
    		storageService.init();
    	};
    }

}