package com.spring.mvc.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<IsValidPassword, String>{
	private static final String PASSWORD_PATTERN = 
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,14})";

	@Override
	public boolean isValid(String passwrdField, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		//"^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$"
		return passwrdField != null && passwrdField.matches(PASSWORD_PATTERN)
		          && (passwrdField.length() > 8) && (passwrdField.length() < 14);
	}

}
