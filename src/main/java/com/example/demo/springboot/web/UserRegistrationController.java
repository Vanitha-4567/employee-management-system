package com.example.demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.springboot.model.User;
import com.example.demo.springboot.service.UserService;
import com.example.demo.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;
public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
}
	@ModelAttribute ("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	@GetMapping
    public String showRegistrationForm() {
    	return "registration";
    }
	@PostMapping("/register")
	public String registerUserAccount(@ModelAttribute("user") User user) {
        try {
            userService.save(user);
            return "registration-success"; // Redirect to success page
        } catch (IllegalArgumentException e) {
            // Handle the exception and display an error
            return "registration-error";
        }
    }
}
