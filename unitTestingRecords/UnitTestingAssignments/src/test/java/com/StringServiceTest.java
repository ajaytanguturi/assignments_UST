package com;

import static org.junit.Assert.*;
import org.junit.Test;
public class StringServiceTest {
	StringService service = new StringService();
	@Test
	public void testConvertToUppercase() {
		String result = service.convertToUppercase("java");
        assertEquals("JAVA", result);

	}
}