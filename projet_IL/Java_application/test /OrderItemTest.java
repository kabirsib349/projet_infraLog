package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderItemTest {

	 private Product product;
	 private OrderItem orderItem, orderItem1, orderItem2;
	    
	 @BeforeEach
	    public void setUp() {
	        product = new Product(1, "Café", "Boisson", true);
	        orderItem = new OrderItem(product, 2, Size.MOYEN, SugarLevel.MEDIUM);
	    }

	    @Test
	    public void testGetPrice() {
	        assertEquals(9.0, orderItem.getPrice()); // (2.0 base + 1.0 (sugar)) * 1.5 (size) * 2 (quantity)
	    }
	    
	    @Test
	    public void testGetQuantity() {
	        assertEquals(2, orderItem.getQuantity());
	    }

	    @Test
	    public void testGetSize() {
	        assertEquals(Size.MOYEN, orderItem.getSize());
	    }

	    @Test
	    public void testGetSugarLevel() {
	        assertEquals(SugarLevel.MEDIUM, orderItem.getSugarLevel());
	    }
	    
	    @Test
	    public void testGetSugarLevelValue() {
	    	assertEquals(orderItem.getSugarLevelValue(), 2);
	    }
	    
	    @Test
	    public void testCalculatePrice() {
	        // Cas avec Size.PETIT
	        orderItem1 = new OrderItem(product, 1, Size.PETIT, SugarLevel.NO_SUGAR);
	        assertEquals(2.0, orderItem1.getPrice());

	        // Cas avec Size.GRAND et beaucoup de sucre
	        orderItem2 = new OrderItem(product, 3, Size.GRAND, SugarLevel.HIGH);
	        assertEquals((2.0 + 3*0.5) * 2.0 * 3, orderItem2.getPrice());
	    }

}
