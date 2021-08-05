package com.src.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.entities.Admin;
import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.exceptions.InValidDomainException;
import com.src.exceptions.InvalidEngineerIdException;

public interface IAdminRepository extends JpaRepository<Admin,Integer>{
	
//	public void addEngineer(Engineer e);
//	public void changeDomain(int engineerId,String newDomain)throws InValidDomainException,InvalidEngineerIdException;
//	public void removeEngineer(int engineerId)throws InvalidEngineerIdException;
//	
//	public List<Complaint> getComplaintsByProducts(String productCategoryName);
//	public List<Complaint> getComplaints(String status,String productCategoryName);
//	
//	public Complaint replaceEngineerFromComplaint(int complaintId)throws InValidDomainException; // replace engineer from the complaint and allocate new engineer
//	
	
}
