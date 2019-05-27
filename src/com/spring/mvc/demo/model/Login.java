package com.spring.mvc.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.spring.mvc.demo.validator.IsValidPassword;

public class Login {
	
	@NotNull
	@Size(max=14 , min=8)
	private String userName;
	
	@NotNull
	@IsValidPassword
	private String passwrd;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

}
