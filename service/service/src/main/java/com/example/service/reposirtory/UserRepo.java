package com.example.service.reposirtory;

import org.springframework.stereotype.Repository;

import com.example.service.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

	User findUserById(long id);

}
