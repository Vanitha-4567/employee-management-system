package com.example.demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/Home")

	public String home() {
		return "index";
		
	}

}
