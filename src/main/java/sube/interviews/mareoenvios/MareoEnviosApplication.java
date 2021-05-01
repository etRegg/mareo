package sube.interviews.mareoenvios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@PropertySource(value = {"classpath:application.properties"})
@EnableAutoConfiguration
@ComponentScan("sube.interviews.mareoenvios")
@SpringBootApplication
public class MareoEnviosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MareoEnviosApplication.class, args);
	}

}
