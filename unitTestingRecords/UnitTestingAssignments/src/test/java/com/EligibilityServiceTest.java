package com;

import static org.junit.Assert.*;
import org.junit.Test;
public class EligibilityServiceTest {
	EligibilityService service = new EligibilityService();

	@Test
	public void testIsEligibleToVote() {
		boolean result = service.isEligibleToVote(20);
        assertTrue(result);
	}
	 @Test
	 public void testNotEligibleAge() {
		 boolean result = service.isEligibleToVote(16);
		 assertFalse(result);
	 }
}