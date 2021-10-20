package com.example.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.entity.User;
import com.example.service.reposirtory.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Service 
@Slf4j
public class UserService {
	@Autowired
	private UserRepo userrepo;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		log.info("inside save user service");
		return userrepo.save(user);
	}

//	public User findUserById(long id) {
//		// TODO Auto-generated method stub
//		log.info("inside find by id service");
//		return userrepo.findById(id);
//	}

	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return userrepo.findUserById(id);
	}
}
