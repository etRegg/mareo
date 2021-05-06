package sube.interviews.mareoenvios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import sube.interviews.mareoenvios.entity.Customer;
import sube.interviews.mareoenvios.entity.Product;
import sube.interviews.mareoenvios.entity.Shipping;
import sube.interviews.mareoenvios.entity.ShippingItem;

@SpringBootTest
class MareoEnviosApplicationTests {

	@Test
	void entity1Loads() {
		
		Object goat = new Customer();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Customer", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.entity.Customer", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.entity.Customer", clazz.getCanonicalName());
    }

	@Test
	void entity2() {
		
		Object goat = new Product();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Product", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.entity.Product", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.entity.Product", clazz.getCanonicalName());
    }
	

	@Test
	void entity3Loads() {
		
		Object goat = new Shipping();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Shipping", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.entity.Shipping", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.entity.Shipping", clazz.getCanonicalName());
    }
	
	

	@Test
	void entity4Loads() {
		
		Object goat = new ShippingItem();
		Class<?> clazz = goat.getClass();
		
		assertEquals("ShippingItem", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.entity.ShippingItem", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.entity.ShippingItem", clazz.getCanonicalName());
    }
	
	

	@Test
	void contextLoads() {
		
		Object goat = new Customer();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Customer", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.entity.Customer", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.entity.Customer", clazz.getCanonicalName());
    }
	
}
