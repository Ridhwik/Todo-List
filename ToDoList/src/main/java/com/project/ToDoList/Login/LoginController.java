package com.project.ToDoList.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private AuthenticationService service;
	
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	public String loginPage(){
		
		
		return "LoginJSP";
		
	}
	
	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String loginPage(@RequestParam String name ,@RequestParam String password , ModelMap model){
		
		
		if(service.authenticate(name, password)) {
			
			model.put("name", name);
			
			
			return "welcome";
		}
		
		else {
			
			model.put("errormessage", "Invalid Credentials!!!!");
			return "LoginJSP";
		}
		
	}

}
