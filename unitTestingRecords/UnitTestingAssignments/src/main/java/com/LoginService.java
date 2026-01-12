package com;
public class LoginService {
	public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            return true;
        }
        return false;
    }
}