package com;

import static org.junit.Assert.*;
import org.junit.Test;
public class LoginServiceTest {
	LoginService service = new LoginService();
	@Test
	public void testValidLogin() {
		boolean result = service.login("admin", "admin123");
        assertTrue(result);
	}
	@Test
    public void testInvalidLogin() {
        boolean result = service.login("user", "wrongpass");
        assertFalse(result);
    }

}
