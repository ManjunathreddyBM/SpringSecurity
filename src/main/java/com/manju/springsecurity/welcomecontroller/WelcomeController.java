package com.manju.springsecurity.welcomecontroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Basic Application with Spring security";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('user')")
	public String user() {
		return "Hi User";
	}
}
