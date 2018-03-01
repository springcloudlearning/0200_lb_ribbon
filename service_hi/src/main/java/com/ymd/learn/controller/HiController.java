package com.ymd.learn.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ymd.learn.entity.User;

@RestController
public class HiController {

	@Resource
	private RestTemplate restTemplate;
	
	@GetMapping("/hi")
	@HystrixCommand(fallbackMethod="getUserByIdHystrix")
	public User getUserById(@RequestParam("id") int id) {
		return restTemplate.getForObject("http://SERVICE-USER/user?id="+id, User.class);
	}
	
	public User getUserByIdHystrix(int id) {
		User user = new User();
		user.setName("Anonymous Name");
		return user;
	}
	
}
