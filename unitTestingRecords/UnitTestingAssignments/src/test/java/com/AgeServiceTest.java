package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class AgeServiceTest {
	@Test(expected = IllegalArgumentException.class)
	public void testValidateAge() {
		AgeService service = new AgeService();
        service.validateAge(-5);
	}
}