package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class CountryServiceTest {
	@Test
	public void testGetDefaultCountryCode() {
		CountryService service = new CountryService();
        String result = service.getDefaultCountryCode();
        assertEquals("IN", result);
	}
}