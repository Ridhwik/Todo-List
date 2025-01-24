package com.project.ToDoList.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("Syfer");
		boolean isValidPassword = password.equalsIgnoreCase("ramzi");
		
		return isValidUserName && isValidPassword;
	}
}
