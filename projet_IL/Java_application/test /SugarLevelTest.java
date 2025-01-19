package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SugarLevelTest {

	 @Test
	    public void testGetLevel() {
	        assertEquals(0, SugarLevel.NO_SUGAR.getLevel());
	        assertEquals(1, SugarLevel.LOW.getLevel());
	        assertEquals(2, SugarLevel.MEDIUM.getLevel());
	        assertEquals(3, SugarLevel.HIGH.getLevel());
	    }
	 
	 @Test
	    public void testFromLevel() {
		 assertEquals(SugarLevel.NO_SUGAR, SugarLevel.fromLevel(0));
		 assertEquals(SugarLevel.LOW, SugarLevel.fromLevel(1));
		 assertEquals(SugarLevel.MEDIUM, SugarLevel.fromLevel(2));
		 assertEquals(SugarLevel.HIGH, SugarLevel.fromLevel(3));
		 
	 }
	 
	 @Test
	    public void testFromLevel_InvalidLevel() {
	        // Vérifie que l'exception est lancée pour un niveau de sucre invalide
	        Exception e = assertThrows(IllegalArgumentException.class, () -> {
	            SugarLevel.fromLevel(5); // 5 n'est pas un niveau valide
	        });

	        String expectedMessage = "Niveau de sucre invalide : 5";
	        String actualMessage = e.getMessage();

	        assertTrue(actualMessage.contains(expectedMessage)); // Vérifie que le message d'exception est correct
	    }

}
