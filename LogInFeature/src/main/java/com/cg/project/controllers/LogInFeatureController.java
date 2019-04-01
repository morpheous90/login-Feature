package com.cg.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.project.beans.User;
import com.cg.project.services.UserService;

@Controller
public class LogInFeatureController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/registrationCustomer")
	public ModelAndView registerAssociate(@ModelAttribute User user) {
		user=userService.acceptUserDetails(user);
		return new ModelAndView("registrationSuccessPage","customer",user);
	}
}
