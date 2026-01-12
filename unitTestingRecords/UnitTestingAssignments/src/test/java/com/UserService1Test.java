package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class UserService1Test {
	@Test
	public void testIsUserActive() {
		UserService1 service = new UserService1();
        boolean result = service.isUserActive();
        assertTrue(result);
	}
}