package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class DataServiceTest {
	@Test
	public void testIsDataPresent() {
		DataService service = new DataService();
        boolean result = service.isDataPresent();
        assertTrue(result);
	}
}