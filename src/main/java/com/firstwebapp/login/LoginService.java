package com.firstwebapp.login;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if (user.equals("firstwebapp") && password.equals("dummy"))
			return true;

		return false;
	}
}
