package com;

public class EmailService {
	public boolean isValidEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }
}
