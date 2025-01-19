package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SizeTest {

	@Test
	void test() {
		assertEquals(Size.PETIT.getValue(), "PETIT");
		assertEquals(Size.GRAND.getValue(), "GRAND");
		assertEquals(Size.MOYEN.getValue(), "MOYEN");
	}

}
