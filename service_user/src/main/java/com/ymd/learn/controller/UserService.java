package com.ymd.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymd.learn.entity.User;

@RestController
public class UserService {
	
	@Value("${server.port}")
	int port;
	
	@GetMapping("/user")
	public User getUserById(@RequestParam int id) {
		System.out.println("Invoke UserService - getUserById");
		User user = new User();
		user.setId(id);
		user.setName("michael");
		user.setAge(33);
		user.setPort(port);
		return user;
	}
	
}
