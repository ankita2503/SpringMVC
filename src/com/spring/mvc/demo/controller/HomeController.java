package com.spring.mvc.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.demo.model.Login;

@Controller
public class HomeController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Date date = new Date();
		model.addAttribute("login", new Login());
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Valid Login login, BindingResult bindingResult) {
		System.out.println("User Page Requested");
		if(bindingResult.hasErrors()) {
			System.out.println("encountered Binding errors");
			return "home";
		}
		return "user";
	}
	
	/*@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		return "NullPointerException";
	}*/
}
