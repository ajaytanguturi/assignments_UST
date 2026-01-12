package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class StringService1Test {
	@Test
	public void testGetCharacterCount() {
		StringService1 service = new StringService1();
        int result = service.getCharacterCount("Hello");
        assertEquals(5, result);
	}
}