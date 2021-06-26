package com.smoothstack.utopiaspring.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.smoothstack.utopiaspring.model.User;
import com.smoothstack.utopiaspring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public User save(User user) {
		return userRepo.save(user);

	}

	public User getUserById(Integer id) {
		return userRepo.findById(id).get();
	}

	@Transactional
	public User deleteUser(Integer id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()){
			userRepo.deleteById(id);
		}
		return user.orElse(null);
	}

	@Transactional
    public User updateUser(User user) {

		Optional<User> updatedUser = userRepo.findById(user.getId());
		System.out.println("updated user: " + updatedUser);
		System.out.println("user: " + user);

		String updatedFirstName = user.getFirstName();
		String updatedLastName = user.getLastName();
		String updatedUsername = user.getUsername();
		String updatedEmail = user.getEmail();
		String updatedPassword = user.getPassword();
		String updatedPhone = user.getPhone();
		updatedUser.get().setRoleId(user.getRoleId());

		System.out.println(updatedUser.get().getRoleId());
		if (updatedUser.isPresent()) {
			if (updatedFirstName != null && updatedFirstName.length() > 0) {

				updatedUser.get().setFirstName(updatedFirstName);
			}

			if (updatedLastName != null && updatedLastName.length() > 0) {

				updatedUser.get().setLastName(updatedLastName);
			}

			if (updatedUsername != null && updatedUsername.length() > 0) {

				updatedUser.get().setUsername(updatedUsername);
			}

			if (updatedEmail != null && updatedEmail.length() > 0) {

				updatedUser.get().setEmail(updatedEmail);
			}

			if (updatedPassword != null && updatedPassword.length() > 0) {

				updatedUser.get().setPassword(updatedPassword);
			}

			if (updatedPhone != null && updatedPhone.length() > 0) {

				updatedUser.get().setPhone(updatedPhone);
			}

			user = userRepo.save(updatedUser.get());
		}

		return user;

	}

}
