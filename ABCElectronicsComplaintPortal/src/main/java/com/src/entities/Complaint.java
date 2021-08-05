package com.src.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="Complaint_tbl")
public class Complaint {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int complaintId;
    @NotNull(message = "Product Model Number is Required")
	private String productModelNumber; // complaint product model number, Model Number from Product Class
    @Length(min = 5, max = 15,message="Length of Complaint Name should be between 5 and 15")
    private String complaintName;
    @NotNull(message = "Status is Required")
    private String status; // open , resolve online , resolve after home visit , resolved , closed
	// note : engineer cannot open or close the complaint
	
	private String clientId; 
	
	private int engineerId;
	
	//Default Constructor
	public Complaint() {
		super();
	}

	//Parameterized Constructor
	public Complaint(int complaintId, String productModelNumber, String complaintName, String status, String clientId,
			int engineerId) {
		super();
		this.complaintId = complaintId;
		this.productModelNumber = productModelNumber;
		this.complaintName = complaintName;
		this.status = status;
		this.clientId = clientId;
		this.engineerId = engineerId;
	}

    // Method is used to get the Complaint Id
	public int getComplaintId() {
		return complaintId;
	}
	// Method is used to set the Complaint Id
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	// Method is used to get the Product Model Number
	public String getProductModelNumber() {
		return productModelNumber;
	}
	// Method is used to to set the Product Model Number
	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}
	// Method is used to get the Complaint Name
	public String getComplaintName() {
		return complaintName;
	}
	// Method is used to set the Complaint Name
	public void setComplaintName(String complaintName) {
		this.complaintName = complaintName;
	}
	// Method is used to get the Status
	public String getStatus() {
		return status;
	}
	// Method is used to set the Status
	public void setStatus(String status) {
		this.status = status;
	}
	// Method is used to get the Client Id
	public String getClientId() {
		return clientId;
	}
	// Method is used to set the Client Id
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	// Method is used to get the Engineer Id
	public int getEngineerId() {
		return engineerId;
	}
	// Method is used to set the Engineer Id
	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}

}
