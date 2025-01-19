package fr.coffeemocha.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	 private User user;

	    @BeforeEach
	    public void setUp() {
	        user = new User("testUser", "password123");
	    }

	    @Test
	    public void testAuthenticateSuccess() {
	        assertTrue(user.authenticate("testUser", "password123"));
	        assertTrue(user.isAuthenticated());
	    }

	    @Test
	    public void testAuthenticateFailure() {
	        assertFalse(user.authenticate("wrongUser", "password123"));
	        assertFalse(user.isAuthenticated());
	    }

	    @Test
	    public void testGetUsername() {
	        assertEquals("testUser", user.getUsername());
	    }

	    @Test
	    public void testGetPassword() {
	        assertEquals("password123", user.getPassword());
	    }

}
