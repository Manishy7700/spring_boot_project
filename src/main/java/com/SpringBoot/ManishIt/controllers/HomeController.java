package com.SpringBoot.ManishIt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value = "/home")
	public String home() {
		return "welcome to my home page...";
	}
	
	@GetMapping(value = "/contect")
	public String getContaict() {
		return "you can contect on Manish@gmail.com";
	}
	
	@GetMapping(value = "/services")
	public String getServices() {
		return "you can contect on Manish@gmail.com";
	}


}
