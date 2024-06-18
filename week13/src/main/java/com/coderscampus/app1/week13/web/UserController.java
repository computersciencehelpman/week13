package com.coderscampus.app1.week13.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.app1.week13.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserController (UserService userservice) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public String getUsers () {
		return userService.getMessage();
	}
	
}
