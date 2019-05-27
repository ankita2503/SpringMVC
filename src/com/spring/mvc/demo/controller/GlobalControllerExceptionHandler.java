package com.spring.mvc.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ExceptionHandler(value = RuntimeException.class)
	public String handleRunTimeException(RuntimeException e) {
		return "error";
	}

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(NullPointerException e) {
		return "NullPointerException";
	}
}
