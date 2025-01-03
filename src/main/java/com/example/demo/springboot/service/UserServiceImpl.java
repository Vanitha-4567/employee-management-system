package com.example.demo.springboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.springboot.model.Role;
import com.example.demo.springboot.model.User;
import com.example.demo.springboot.repository.UserRepository;
import com.example.demo.springboot.web.dto.UserRegistrationDto;
@Service
public class UserServiceImpl implements UserService {
	@Lazy
private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = newUser(registrationDto.getFirstName(), registrationDto.getLastName(),
				registrationDto.getEmail(),passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

	private User newUser(String firstName, String lastName, String email, String encode, List<Role> asList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user =userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or passsword");
		}
			return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getGrantedAuthorities(user.getRoles()));
	}
			
	public List<SimpleGrantedAuthority> getGrantedAuthorities(Collection<Role> collection) {
        return collection.stream()
                    .map(role -> new SimpleGrantedAuthority(role.getName()))
                    .collect(Collectors.toList());
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save1(User user) {
		// TODO Auto-generated method stub
		
	}
}
			
		
	



