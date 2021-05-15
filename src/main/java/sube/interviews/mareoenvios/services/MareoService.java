package sube.interviews.mareoenvios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import sube.interviews.mareoenvios.controller.MainController;
import sube.interviews.mareoenvios.entity.Customer;
import sube.interviews.mareoenvios.entity.Shipping;
import sube.interviews.mareoenvios.repository.CustomerRepository;
import sube.interviews.mareoenvios.repository.ShippingRepository;
import sube.interviews.mareoenvios.response.CustomResponse;

@Service
public class MareoService {

	@Autowired
	private CustomerRepository  repository;
	@Autowired
	private ShippingRepository shippingrepo;
	@Autowired
	private CustomerRepository customer;
	
	public ResponseEntity<CustomResponse> shiped( Integer shippingId, CustomResponse custom) {
		Shipping	result = this.shippingrepo.findById(shippingId).orElseThrow(() -> new RuntimeException("No existe entidad"));
		   custom.status= 200;
		   custom.data = result;
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	}
	public ResponseEntity<CustomResponse> customer(Integer customerId, CustomResponse custom) {
		   Customer	result = repository.findById(customerId).orElseThrow(() -> new RuntimeException("No existe entidad"));
		   custom.status= 200;
		   custom.data = result;
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	}
	public ResponseEntity<CustomResponse> report(CustomResponse custom) {
		   List<Customer> retorno = new ArrayList<Customer>();
		   Iterable<Customer>	result = customer.findAll();
		   result.forEach((Customer sp)->retorno.add(sp));
	       custom.status= 200;
		   custom.data = retorno.stream().sorted();
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	}
	
	public ResponseEntity<CustomResponse> reportv2(CustomResponse custom) {
		   List<Customer> retorno = new ArrayList<Customer>();
		   Iterable<Customer>	result = customer.findAll();
		   result.forEach((Customer sp)->retorno.add(sp));
	       custom.status= 200;
		   custom.data = retorno.stream().filter( t-> t.getSuccess() >0).sorted();
		   return ResponseEntity.status(HttpStatus.ACCEPTED).body(custom);
	}
	
}
