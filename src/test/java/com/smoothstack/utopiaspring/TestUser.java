package com.smoothstack.utopiaspring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.smoothstack.utopiaspring.model.User;

import com.smoothstack.utopiaspring.repository.UserRepository;

import com.smoothstack.utopiaspring.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {UserService.class})
//@ExtendWith (MockitoExtension.class);
@ExtendWith(SpringExtension.class)

class TestUserService {

	@MockBean
	private UserRepository userRepo;

//	@MockBean
//	private UserRoleRepository roleRepo;

	@Autowired
	private UserService userService;

	private User mockUser1;
//	private User mockUser2;
	//private UserRole role;
	private List<User> mockUsers;

	@BeforeEach
	void setUp() {
		mockUser1 = new User();
		mockUser1.setId(1);
		mockUser1.setRoleId(3);
		mockUser1.setUsername("user.one");
		mockUser1.setFirstName("mockName");
		mockUser1.setLastName("mockLastName");
		mockUser1.setEmail("mockUser1@utopia.com");
		mockUser1.setPhone("777-777-7777");
		mockUser1.setPassword("mockpass");
		mockUsers = new ArrayList<>();
		mockUsers.add(mockUser1);
	}

	@Test
	void addUser() {
		when(userRepo.save(any())).thenReturn(mockUser1);
		
		assertSame(mockUser1, userService.save(mockUser1));
		
	
		assertTrue(userService.getUsers().isEmpty());
	}

	@Test
	void getUsers() {
		when(userRepo.findAll()).thenReturn(mockUsers);
		assertSame(mockUsers, userService.getUsers());
		verify(userRepo).findAll();
	}

	@Test
	void getUserById() {
		when(userRepo.findById(any())).thenReturn(Optional.of(mockUser1));
		assertSame(mockUser1, userService.getUserById(1));
		verify(userRepo).findById(any());
	}

	@Test
	void updateUser() {
		User mockUser2 = new User();
		mockUser2.setId(2);
		mockUser2.setRoleId(1);
		mockUser2.setUsername("mock2");
		mockUser2.setFirstName("user");
		mockUser2.setLastName("mockLastName");
		mockUser2.setEmail("test@utopia.com");
		mockUser2.setPhone("888-888-8888");
		mockUser2.setPassword("mockpass");

		when(userRepo.findById(any())).thenReturn(Optional.of(mockUser2));
		when(userRepo.save(any())).thenReturn(mockUser2);
		assertSame(mockUser2, userService.updateUser(mockUser2));
		verify(userRepo).save(any());
		assertTrue(userService.getUsers().isEmpty());
	}

//	@Test
//	void deleteUser() {
//		doNothing().when(userRepo).delete(any());
//		when(userRepo.findById(any())).thenReturn(Optional.of(mockUser2));
//		
//		assertSame(mockUser2, userService.deleteUser(2));
//		verify(userRepo).deleteById(any());
//		assertTrue(userService.getUsers().isEmpty());
//	}
}