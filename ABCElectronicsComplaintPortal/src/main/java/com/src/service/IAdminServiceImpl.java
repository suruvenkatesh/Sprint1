package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.exceptions.InValidDomainException;
import com.src.exceptions.InvalidEngineerIdException;
import com.src.repository.IAdminRepository;

public class IAdminServiceImpl implements IAdminService {

//	@Autowired
//	IAdminRepository repo;
	
//	@Override
//	public void addEngineer(Engineer e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void changeDomain(int engineerId, String newDomain)
//			throws InValidDomainException, InvalidEngineerIdException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeEngineer(int engineerId) throws InvalidEngineerIdException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Complaint> getComplaintsByProducts(String productCategoryName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Complaint> getComplaints(String status, String productCategoryName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Complaint replaceEngineerFromComplaint(int complaintId) throws InValidDomainException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
