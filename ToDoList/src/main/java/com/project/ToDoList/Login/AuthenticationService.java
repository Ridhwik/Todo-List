package com.project.ToDoList.Login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	
	public boolean authenticate(String user , String password){
		
		boolean username = user.equalsIgnoreCase("Syfer");
		boolean pass = password.equalsIgnoreCase("Ramzi");
		
		return username && pass; 
		
		
	}

}
