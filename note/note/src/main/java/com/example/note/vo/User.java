package com.example.note.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
	
	private String firstName;
	
	private String lastName;
	private String mobileNumber;
	private String email;
	private String password;
	
	//private Boolean isEmailVerified;
	
	//private String profileURL;
}
