package com.project.ToDoList.security;

import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	
	@Bean
	public InMemoryUserDetailsManager createUserDetailManager() {
		
		
		
		UserDetails userDetails = createNewUser("Syfer", "Ramzi");
		
		
		
		return new InMemoryUserDetailsManager(userDetails);
	}



	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passEncoder = input -> passwordEncoder().encode(input);

		UserDetails userDetails = User.builder().passwordEncoder(passEncoder)
									.username(username)
									.password(password)
									.roles("USER", "ADMIN")
									.build();
		return userDetails;
	}
	
	//All URLs are protected
		//A login form is shown for unauthorized requests
		//CSRF disable
		//Frames
		
		@SuppressWarnings("removal")
		@Bean
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			
			http.authorizeHttpRequests(
					auth -> auth.anyRequest().authenticated());
			http.formLogin(withDefaults());
			
			http.csrf().disable();
			http.headers().frameOptions().disable();
			
			return http.build();
		}
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
