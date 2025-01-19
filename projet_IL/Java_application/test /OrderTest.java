package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {

	 private Order order;
	    private OrderItem orderItem1;
	    private OrderItem orderItem2;
	    private Product product1;
	    private Product product2;
	    
	@BeforeEach
    public void setUp() {
        order = new Order(1); // Initialisation d'une commande avec l'ID 1
        
        product1 = new Product(1, "Café", "Boisson", true);
        product2 = new Product(2, "Thé", "Boisson", true);
        
        orderItem1 = new OrderItem(product1, 2, Size.MOYEN, SugarLevel.LOW); // Prix attendu : (2.0 + 0.5) * 1.5 * 2 = 7.5
        orderItem2 = new OrderItem(product2, 1, Size.GRAND, SugarLevel.HIGH); // Prix attendu : (2.0 + 3 * 0.5) * 2.0 * 1 = 7.0
    }

    @Test
    public void testAddOrderItem() {
        order.addOrderItem(orderItem1);
        List<OrderItem> items = order.getOrderItems();
        assertEquals(1, items.size()); // Vérifie qu'il y a un élément dans la commande
        assertEquals(orderItem1, items.get(0)); // Vérifie que c'est le bon élément
    }

    @Test
    public void testRemoveOrderItem() {
        order.addOrderItem(orderItem1);
        order.addOrderItem(orderItem2);
        
        order.removeOrderItem(orderItem1);
        List<OrderItem> items = order.getOrderItems();
        
        assertEquals(1, items.size()); // Vérifie qu'il reste un élément après suppression
        assertEquals(orderItem2, items.get(0)); // Vérifie que c'est le bon élément qui reste
    }

    @Test
    public void testCalculateTotalPrice() {
        order.addOrderItem(orderItem1); // Prix : 7.5
        order.addOrderItem(orderItem2); // Prix : 7.0
        double totalPrice = order.calculateTotalPrice();
        assertEquals(14.5, totalPrice, 0.01); // Vérifie que le total est correct
    }

    @Test
    public void testCalculateTotalPrice_EmptyOrder() {
        double totalPrice = order.calculateTotalPrice();
        assertEquals(0.0, totalPrice); // Vérifie que le total est 0.0 pour une commande vide
    }

    @Test
    public void testGetOrderId() {
        assertEquals(1, order.getOrderId()); // Vérifie que l'ID de la commande est correct
    }

    @Test
    public void testGetOrderItems() {
        order.addOrderItem(orderItem1);
        order.addOrderItem(orderItem2);
        
        List<OrderItem> items = order.getOrderItems();
        assertEquals(2, items.size()); // Vérifie qu'il y a deux éléments
        assertTrue(items.contains(orderItem1)); // Vérifie que le premier élément est présent
        assertTrue(items.contains(orderItem2)); // Vérifie que le second élément est présent
    }

    @Test
    public void testGetStatus() {
        assertEquals(OrderStatus.EN_ATTENTE, order.getStatus()); // Vérifie que le statut initial est EN_ATTENTE
    }

    @Test
    public void testSetStatus() {
        order.setStatus(OrderStatus.EN_COURS);
        assertEquals(OrderStatus.EN_COURS, order.getStatus()); // Vérifie que le statut a bien été mis à jour
    }

}
