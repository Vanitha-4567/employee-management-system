package com.example.demo.springboot.web.dto;

public class UserRegistrationDto {
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	
	void UserRegstrationDto(){
		
	}
		
	
	
	public UserRegistrationDto(String firstName, String lastName, String email, String password) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Email = email;
		this.Password = password;
	}
	public UserRegistrationDto() {
		// TODO Auto-generated constructor stub
	}



	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}


}
