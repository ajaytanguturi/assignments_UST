package com;

public class AgeService {
	public int validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        return age;
    }
}
