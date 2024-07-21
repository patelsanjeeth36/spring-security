package com.spring.security.project.controller;

import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 
	@GetMapping("/data")
	public String getMethod() {
		return "Welcome to spring security";
	}
	
	@GetMapping("/account")
	public String account() {
		return "account";
	}
	
	@GetMapping("/balance")
	public String balance(){
		return "balance :100";
	}
	
	@GetMapping("/update")
	public String update(){
		return "update";
	}
	
	@GetMapping("/main")
	public String mainPage(){
		return "mainPage";
	}
	 

}
