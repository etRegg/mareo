package sube.interviews.mareoenvios.controller;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sube.interviews.mareoenvios.response.CustomResponse;
import sube.interviews.mareoenvios.services.MareoService;

@RestController
public class MainController {
	
	@Autowired
	private MareoService servicio;
	@GetMapping("/customer/info/{customerId}")
	public ResponseEntity<CustomResponse> getCustomer(@PathVariable Integer customerId) {
		 CustomResponse custom = new CustomResponse();
		   try{
			   return this.servicio.customer(customerId, custom);
		   }catch(Exception e) {
			   return common404(custom);   
		   }			
	}

	/**
	 * @deprecated Use {@link sube.interviews.mareoenvios.services.MareoService#costomer(sube.interviews.mareoenvios.controller.MainController,Integer,CustomResponse)} instead
	 */
	private ResponseEntity<CustomResponse> customer(Integer customerId, CustomResponse custom) {
		return this.servicio.customer(customerId, custom);
	}
	/**
	 * @deprecated Use {@link sube.interviews.mareoenvios.services.MareoService#report(sube.interviews.mareoenvios.controller.MainController,CustomResponse)} instead
	 */
	private ResponseEntity<CustomResponse> report(CustomResponse custom) {
		return servicio.report(this, custom);
	}
	/**
	 * @deprecated Use {@link sube.interviews.mareoenvios.services.MareoService#shiped(sube.interviews.mareoenvios.controller.MainController,Integer,CustomResponse)} instead
	 */
	private ResponseEntity<CustomResponse> shiped(Integer shippingId, CustomResponse custom) {
		return servicio.shiped(this, shippingId, custom);
	}
	
	@GetMapping("/shipping/info/{shippingId}")
	public ResponseEntity<CustomResponse> getShipping(@PathVariable Integer shippingId)  {
	   CustomResponse custom = new CustomResponse();
	   try{
		   return shiped(shippingId, custom);
	   }catch(Exception e) {
		   return common404(custom);  
	   }
	}


	
	
	@GetMapping("/reports/topSended")
	public ResponseEntity<CustomResponse>  getReport()  {
	   CustomResponse custom = new CustomResponse();
	   try{
		   return report(custom);
	   }catch(Exception e) {
		   return common404(custom);  
	   }
	}


	private ResponseEntity<CustomResponse> common404(CustomResponse custom) {
		custom.status= 404;
	       custom.data = null;
		 
	       return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(custom);
	}


	
	
}
