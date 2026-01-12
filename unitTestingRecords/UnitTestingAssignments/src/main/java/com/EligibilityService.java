package com;

public class EligibilityService {
	public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
