package sube.interviews.mareoenvios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import antlr.collections.List;


@SpringBootTest
@Sql({"/schema.sql", "/data.sql"})
public class CaseUse1Tests {
	
	  @Autowired
	  private CustomerRepository customer;
	  
	  @Autowired
	  private ProductRepository productos;
	  
	  @Autowired
	  private ShippingRepository shipping;
	  
	  @Autowired
	  private ShippingItemRepository item;
	  @Test
	  void test1() {

		        assertEquals(3,((ArrayList<Customer>) customer.findAll()).toArray().length);
		  
	  }
	  @Test
	  void test2() {

		        assertEquals(15,((ArrayList<Product>) productos.findAll()).toArray().length);
		  
	  }
	  @Test
	  void test3() {

		        assertEquals(4,((ArrayList<Shipping>) shipping.findAll()).toArray().length);
		  

	  }
	  @Test
	  void test4() {

		        assertEquals(9,((ArrayList<ShippingItem>) item.findAll()).toArray().length);
		  
	  }
}
