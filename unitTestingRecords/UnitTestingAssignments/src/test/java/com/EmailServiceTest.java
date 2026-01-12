package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class EmailServiceTest {
	EmailService service = new EmailService();
	@Test
	public void testIsValidEmail() {
		boolean result = service.isValidEmail("test@example.com");
        assertTrue(result);
	}
}