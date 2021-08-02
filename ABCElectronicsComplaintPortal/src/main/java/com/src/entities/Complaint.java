package com.src.entities;

public class Complaint {

	private int complaintId;
	private String productModelNumber; // complaint product model number, Model Number from Product Class
	private String complaintName;
	private String status; // open , resolve online , resolve after home visit , resolved , closed
	// note : engineer cannot open or close the complaint
	private String clientId; 
	private int engineerId;


}
