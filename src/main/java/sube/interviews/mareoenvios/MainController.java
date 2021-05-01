package sube.interviews.mareoenvios;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private CustomerRepository  repository;
	
	@Autowired
	private ShippingRepository shippingrepo;

	@GetMapping("/customer/info/{customerId}")
	Optional<Customer> getCustomer(@PathVariable Integer customerId) {

		return repository.findById(customerId);
				
	}
	
	@GetMapping("/shipping/info/{shippingId}")
	public ResponseEntity<Shipping> getShipping(@PathVariable Integer shippingId) throws Exception {

	   Shipping	result = this.shippingrepo.findById(shippingId).orElseThrow(() -> new RuntimeException("No existe el usuario"));
	
	 return ResponseEntity.ok(result);
	}

}
