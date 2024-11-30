package com.example.demo.junit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.beans.User;
import com.example.demo.service.UserService;

@SpringBootTest
class test {
	@Autowired
	UserService userService;

//	@Test
//	void register() {
//		User user = new User();
//		user.setUsername("Testuser");
//		user.setEmail("test123@gmail.com");
//		user.setFirstName("Junit");
//		user.setLastName("Test");
//		user.setPassword("qwerty123");
//		user.setAddress("Area51");
//		user.setContact("5521151512");
//		userService.addUserDetail(user);
//		System.out.println(user);
//		assertThat(user).isNotNull();
//	}
	
	@Test
	void search() {
		List<User> users=userService.showUser("N");
		System.out.println(users);
		assertThat(users).isNotEmpty();
	}

}
