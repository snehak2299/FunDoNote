package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.entity.User;
import com.example.service.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	 @Autowired
	private UserService userservice;
	
	 @PostMapping("/")
	public User saveUser(@RequestBody User user) {
		 log.info("inside save user method");
		return userservice.saveUser(user);
	}
	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") long id) {
		log.info("inside find by id method");
		return userservice.findUserById(id);
	}
}
