package com.example.demo.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.springboot.model.User;
import com.example.demo.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
   User save(User user);

void save1(User user);

User save(UserRegistrationDto ss);

}


