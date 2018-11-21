package io.huzzle.filedrop;

import io.huzzle.filedrop.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileDropApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDropApplication.class, args);
	}
}
