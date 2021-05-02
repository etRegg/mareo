package sube.interviews.mareoenvios;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CaseUse1Tests {

	
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test1Message() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/customer/info/1",
				String.class)).contains("{\"status\":200,\"data\":{\"id\":1,\"address\":\"la buena direccion 123\",\"city\":\"CABA\",");
	}
	@Test
	public void test2Message() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/customer/info/34",
				String.class)).contains("{\"status\":404,\"data\":null}");
	}
	@Test
	public void test3Message() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/shipping/info/34",
				String.class)).contains("{\"status\":404,\"data\":null}");
	}
	@Test
	public void test4Message() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/shipping/info/1",
				String.class)).contains("{\"status\":200,\"data\":{\"id\":1,\"customer\":{\"id\":1,\"address\":\"la buena direccion 123\",\"city\":\"CABA\",");
	}
}

