package com;

public class PasswordService {
	public boolean isValidPassword(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }
}
