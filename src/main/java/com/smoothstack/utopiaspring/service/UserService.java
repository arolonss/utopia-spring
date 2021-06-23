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

	public void save(User user) {
		userRepo.save(user);

	}

	public User getUserById(Integer id) {
		return userRepo.findById(id).get();
	}

	public void deleteUser(Integer id) {
		boolean exists = userRepo.existsById(id);
		if (!exists) {
			throw new IllegalStateException("User " + id + " does not exist!");
		}
		userRepo.deleteById(id);
	}

	@Transactional
	public User updateUser(User user, String firstName, String lastName, String username, String email, String password,
			String phone) {
		// User user = userService.getUserById(id);
		// userRepo.findById(id).orElseThrow(() -> new IllegalStateException(
//				"User " + id + " does not exist!"));
		user.setRoleId(user.getRoleId());
		if (firstName != null && firstName.length() > 0 && !Objects.equals(user.getFirstName(), firstName)) {

			user.setFirstName(firstName);
		}

		if (lastName != null && lastName.length() > 0 && !Objects.equals(user.getLastName(), lastName)) {

			user.setLastName(lastName);
		}

		if (username != null && username.length() > 0 && !Objects.equals(user.getUsername(), username)) {

			user.setFirstName(firstName);
		}

		if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {

			user.setFirstName(firstName);
		}

		if (password != null && password.length() > 0 && !Objects.equals(user.getPassword(), password)) {

			user.setFirstName(firstName);
		}

		if (phone != null && phone.length() > 0 && !Objects.equals(user.getPhone(), phone)) {

			user.setFirstName(firstName);
		}
		User updatedUser = userRepo.save(user);

		return updatedUser;

	}

	public User updateUser(User user) {
		//user = userRepo.findById(user.getId()).get();
		Optional<User> updatedUser = userRepo.findById(user.getId());
		System.out.println("updated user: " + updatedUser);
		System.out.println("user: " + user);
		//Integer role = user.getRoleId();
		String updatedFirstName = user.getFirstName();
		String updatedLastName = user.getLastName();
		String updatedUsername = user.getUsername();
		String updatedEmail = user.getEmail();
		String updatedPassword = user.getPassword();
		String updatedPhone = user.getPhone();
		updatedUser.get().setRoleId(user.getRoleId());
		//System.out.println(role);
		System.out.println(updatedUser.get().getRoleId());
		if (updatedUser.isPresent()) {
			if (updatedFirstName != null && updatedFirstName.length() > 0) {

				updatedUser.get().setFirstName(updatedFirstName); 
			}

			if (updatedLastName != null && updatedLastName.length() > 0 ) {

				
				updatedUser.get().setLastName(updatedLastName); //.orElseGet(() -> updatedUser.get().getLastName()));
			}

			if (updatedUsername != null && updatedUsername.length() > 0 ) {

				//updatedUser.setFirstName(firstName);
				updatedUser.get().setUsername(updatedUsername); //.orElseGet(() -> updatedUser.get().getUsername()));
			}

			if (updatedEmail != null && updatedEmail.length() > 0 ) {

				updatedUser.get().setEmail(updatedEmail);
			}

			if (updatedPassword != null && updatedPassword.length() > 0 ) {

				updatedUser.get().setPassword(updatedPassword);
			}

			if (updatedPhone != null && updatedPhone.length() > 0 ) {

				updatedUser.get().setPhone(updatedPhone);
			}
			System.out.println(updatedUser + "before saving");
			user = userRepo.save(updatedUser.get());
		}
        System.out.println(user + "after saving");
		return user;

	}

}
