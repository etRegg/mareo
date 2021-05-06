package sube.interviews.mareoenvios.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sube.interviews.mareoenvios.entity.Customer;
import sube.interviews.mareoenvios.entity.Shipping;
import sube.interviews.mareoenvios.repository.CustomerRepository;
import sube.interviews.mareoenvios.repository.ShippingRepository;
import sube.interviews.mareoenvios.response.CustomResponse;

@RestController
public class MainController {
	
	@Autowired
	private CustomerRepository  repository;
	
	@Autowired
	private ShippingRepository shippingrepo;
	
	@Autowired
	private CustomerRepository customer;

	@GetMapping("/customer/info/{customerId}")
	ResponseEntity<CustomResponse> getCustomer(@PathVariable Integer customerId) {
		 CustomResponse custom = new CustomResponse();
		   try{
			   Customer	result = this.repository.findById(customerId).orElseThrow(() -> new RuntimeException("No existe entidad"));
			   custom.status= 200;
			   custom.data = result;
			   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
		   }catch(Exception e) {
			   custom.status= 404;
		       custom.data = null;
			 
			   return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(custom);   
		   }			
	}
	
	@GetMapping("/shipping/info/{shippingId}")
	public ResponseEntity<CustomResponse> getShipping(@PathVariable Integer shippingId)  {
	   CustomResponse custom = new CustomResponse();
	   try{
		   Shipping	result = this.shippingrepo.findById(shippingId).orElseThrow(() -> new RuntimeException("No existe entidad"));
		   custom.status= 200;
		   custom.data = result;
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	   }catch(Exception e) {
		   custom.status= 404;
	       custom.data = null;
		 
	       return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(custom);  
	   }
	}
	
	
	@GetMapping("/reports/topSended")
	public ResponseEntity<CustomResponse>  getReport()  {
	   CustomResponse custom = new CustomResponse();
	   try{
		   List<Customer> retorno = new ArrayList<Customer>();
		   Iterable<Customer>	result = this.customer.findAll();
		   result.forEach((Customer sp)->retorno.add(sp));
	       custom.status= 200;
		   custom.data = retorno.stream().sorted();
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	   }catch(Exception e) {
		   custom.status= 404;
	       custom.data = null;
		 
	       return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(custom);  
	   }
	}
	
}
