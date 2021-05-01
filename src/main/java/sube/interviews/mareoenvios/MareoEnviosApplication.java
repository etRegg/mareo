package sube.interviews.mareoenvios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@PropertySource(value = {"classpath:application.properties"})
@EnableAutoConfiguration
@ComponentScan("sube.interviews.mareoenvios")
@SpringBootApplication
@Import(SwaggerConfig.class)
public class MareoEnviosApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(MareoEnviosApplication.class, args);
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
           registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
      }
}
