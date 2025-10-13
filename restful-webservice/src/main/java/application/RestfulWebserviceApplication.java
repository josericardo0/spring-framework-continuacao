package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"controller", "olamundo", "usuario", "exception", "versionamento"})
@SpringBootApplication
public class RestfulWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebserviceApplication.class, args);
	}
}
