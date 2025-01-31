package com.project.ToDoList.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

	
	@Bean
	public InMemoryUserDetailsManager createUserDetailManager() {
		
		
		Function<String, String> passEncoder = input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder().passwordEncoder(passEncoder)
									.username("Syfer")
									.password("Ramzi")
									.roles("USER", "ADMIN")
									.build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
