package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class PasswordServiceTest {
	 PasswordService service = new PasswordService();
	@Test
	public void testIsValidPassword() {
		boolean result = service.isValidPassword("password123");
        assertTrue(result);
	}
	 @Test
	 public void testInvalidPassword() {
		 boolean result = service.isValidPassword("pass");
		 assertFalse(result);
	 }
}
