package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product(1, "Café", "Boisson", true);
    }

    @Test
    public void testGetProductId() {
        assertEquals(1, product.getProductId());
    }

    @Test
    public void testGetName() {
        assertEquals("Café", product.getName());
    }

    @Test
    public void testIsAvailable() {
        assertTrue(product.isAvailable());
    }

    @Test
    public void testSetAvailable() {
        product.setAvailable(false);
        assertFalse(product.isAvailable());
    }

}
