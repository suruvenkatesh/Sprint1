package com.src.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private int adminId; // work like as employee id
	private String password;
	private long contactNumber;
	private String emailId;
	
	
}
