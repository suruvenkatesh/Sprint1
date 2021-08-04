package com.src.repository;

import java.util.List;

import com.src.entities.Client;
import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidComplaintIdException;
import com.src.exceptions.InValidDomainException;
import com.src.exceptions.OutofWarrantyException;

public interface IComplaintRepository {

	public boolean bookComplaint(Client clinet,Complaint complaint,Product product)throws OutofWarrantyException;
	public String changeComplaintStatus(Complaint complaintId);
	
	public List<Complaint> getClientAllComplaints(Client client);
	public List<Complaint> getClientAllOpenComplaints(Client client);
	
	public Engineer getEngineer(int complaintId)throws InValidComplaintIdException;
	public Product getProductByComplaint(int complaintId)throws InValidComplaintIdException;
	
}