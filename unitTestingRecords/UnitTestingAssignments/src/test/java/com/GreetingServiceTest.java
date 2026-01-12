package com;

import static org.junit.Assert.*;
import org.junit.Test;
public class GreetingServiceTest {
	@Test
	public void testGetGreeting() {
		GreetingService service = new GreetingService();

        String result = service.getGreeting("User");

        assertEquals("Welcome, User", result);
	}
}