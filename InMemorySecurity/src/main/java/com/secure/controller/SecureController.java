package com.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {
	
	
	@GetMapping("/hi")
	public String Home()
	{
		return "Home Page:: Welcome to Home Page";
	}
	
	@GetMapping("/b")
	public String Balnce()
	{
		return "Balnce Page:: Welcome to Balance Page";
	}
	
	@GetMapping("/c")
	public String Credit()
	{
		return "Credit Page:: Welcome to Credit Page";
	}
	
	@GetMapping("/d")
	public String Details()
	{
		return "Details Page:: Welcome to Details Page";
	}
	

}
