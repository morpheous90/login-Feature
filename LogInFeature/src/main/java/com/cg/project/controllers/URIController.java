package com.cg.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.project.beans.User;

public class URIController {
	private User users;
	
	@RequestMapping({"logInPage"})
	public String getlogInPage() {
		return "logInPage";
	}
	@RequestMapping({"logInSuccessPage"})
	public String getLogInSuccessPage() {
		return "logInSuccessPage";
	}
	@RequestMapping({"logInFailPage"})
	public String getLogInFailPage() {
		return "logInFailPage";
	}
}
