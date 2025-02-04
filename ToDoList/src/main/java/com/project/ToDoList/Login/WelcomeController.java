package com.project.ToDoList.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	
	@RequestMapping(value="/")
	public String gotoWelcomePage(ModelMap model) {
		
		model.put("name", getLoggedIn());
		
		return "welcome";
	}
	
	
	private String getLoggedIn() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

	
}
