package com.smoothstack.utopiaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaspring.model.User;

import com.smoothstack.utopiaspring.service.UserService;

@RestController
@RequestMapping(value = "/utopia")
public class UserController {

	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@PostMapping("/users")
	public List<User> createUser(@RequestBody User user) {
		userService.save(user);
		return userService.getUsers();
	}

}