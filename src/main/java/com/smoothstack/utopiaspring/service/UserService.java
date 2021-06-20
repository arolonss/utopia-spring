package com.smoothstack.utopiaspring.service;

import java.util.List;

import com.smoothstack.utopiaspring.model.User;
import com.smoothstack.utopiaspring.repository.UserRepository;

public class UserService {

	private final UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public void save(User user) {
		userRepo.save(user);
		
	}

}
