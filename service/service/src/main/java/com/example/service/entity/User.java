package com.example.service.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	@Column(nullable=false,unique=true)
	private String mobileNumber;
	
	
	@Column(nullable=false,unique=true)
	private String email;
	
	
	@Column(nullable=false,unique=true)
	private String password;
//	
//	//private Boolean isEmailVerified;
//	
//	//private String profileURL;
//	
//	@CreationTimestamp
//	private LocalDateTime createdTimeStamp;
//	
//	@UpdateTimestamp
//	private LocalDateTime updatedTimeStamp;
}
