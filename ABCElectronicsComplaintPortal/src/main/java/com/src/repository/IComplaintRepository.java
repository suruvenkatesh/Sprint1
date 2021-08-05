package com.src.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.src.entities.Client;
import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidComplaintIdException;
import com.src.exceptions.InValidDomainException;
import com.src.exceptions.OutofWarrantyException;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint,Integer> {

	/*
	public boolean bookComplaint(Client client,Complaint complaint,Product product)throws OutofWarrantyException;
	public String changeComplaintStatus(Complaint complaintId);
	
	public List<Complaint> getClientAllComplaints(Client client);
	public List<Complaint> getClientAllOpenComplaints(Client client);
	
	public Engineer getEngineer(int complaintId)throws InValidComplaintIdException;
	public Product getProductByComplaint(int complaintId)throws InValidComplaintIdException;
	*/
}
