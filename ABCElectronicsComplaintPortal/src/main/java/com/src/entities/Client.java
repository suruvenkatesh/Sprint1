package com.src.entities;

import java.util.List;

public class Client {

	private String clientId; // unique String name like mike123
	private String password;
	private List<Product> productOwned;
	private String address;
	private long phoneNumber;
	private List<Complaint> complaintList; // client can view all complaints

}
