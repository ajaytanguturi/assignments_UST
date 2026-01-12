package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class UserServiceTest {
	UserService service = new UserService();
	@Test
	public void testGetUsername() {
		String username = service.getUsername();
        assertNotNull(username);
	}
}