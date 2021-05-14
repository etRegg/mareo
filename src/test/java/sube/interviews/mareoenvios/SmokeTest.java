package sube.interviews.mareoenvios;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import sube.interviews.mareoenvios.controller.MainController;
import sube.interviews.mareoenvios.response.CustomResponse;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private MainController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	@Test
	public void action1() {
       ResponseEntity<CustomResponse> res = this.controller.getShipping(1);
       assertThat(res.getStatusCode().is2xxSuccessful());
	}
	@Test
	public void action2() {
       ResponseEntity<CustomResponse> res = this.controller.getShipping(781);
       assertThat(res.getStatusCode().is4xxClientError());
	}
	@Test
	public void action1a() {
       ResponseEntity<CustomResponse> res = this.controller.getCustomer(1);
       assertThat(res.getStatusCode().is2xxSuccessful());
	}
	@Test
	public void action2a() {
       ResponseEntity<CustomResponse> res = this.controller.getCustomer(781);
       assertThat(res.getStatusCode().is4xxClientError());
	}
	@Test
	public void action3() {
       ResponseEntity<CustomResponse> res = this.controller.getReport();
       assertThat(res.getStatusCode().is2xxSuccessful());
	}
	@Test
	public void action4() {
       ResponseEntity<CustomResponse> res = this.controller.getReport();
       assertThat(res.hasBody());
	}
}
