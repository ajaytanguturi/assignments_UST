package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class ArrayServiceTest {
	@Test
	public void testContainsValue() {
		ArrayService service = new ArrayService();
        int[] numbers = {10, 20, 30, 40};
        boolean result = service.containsValue(numbers, 30);
        assertTrue(result);
	}
}