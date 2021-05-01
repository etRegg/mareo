package sube.interviews.mareoenvios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MareoEnviosApplicationTests {

	@Test
	void entity1Loads() {
		
		Object goat = new Customer();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Customer", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.Customer", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.Customer", clazz.getCanonicalName());
    }

	@Test
	void entity2() {
		
		Object goat = new Product();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Product", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.Product", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.Product", clazz.getCanonicalName());
    }
	

	@Test
	void entity3Loads() {
		
		Object goat = new Shipping();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Shipping", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.Shipping", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.Shipping", clazz.getCanonicalName());
    }
	
	

	@Test
	void entity4Loads() {
		
		Object goat = new ShippingItem();
		Class<?> clazz = goat.getClass();
		
		assertEquals("ShippingItem", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.ShippingItem", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.ShippingItem", clazz.getCanonicalName());
    }
	
	

	@Test
	void contextLoads() {
		
		Object goat = new Customer();
		Class<?> clazz = goat.getClass();
		
		assertEquals("Customer", clazz.getSimpleName());
		assertEquals("sube.interviews.mareoenvios.Customer", clazz.getName());
		assertEquals("sube.interviews.mareoenvios.Customer", clazz.getCanonicalName());
    }
	
}
