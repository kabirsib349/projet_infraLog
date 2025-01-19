package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderStatusTest {

	@Test
    public void testOrderStatusValues() {
        assertEquals("EN_ATTENTE", OrderStatus.EN_ATTENTE.getValue());
        assertEquals("EN_COURS", OrderStatus.EN_COURS.getValue());
        assertEquals("PRET", OrderStatus.PRET.getValue());
    }

}
