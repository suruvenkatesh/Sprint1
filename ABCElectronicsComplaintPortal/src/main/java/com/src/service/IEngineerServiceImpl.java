package com.src.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.repository.IEngineerRepository;

public class IEngineerServiceImpl implements IEngineerService {
	@Autowired
	IEngineerRepository engineerRepository;
	
	@Override
	public List<Complaint> getAllOpenComplaints(Engineer e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaint> getResolvedComplaints(Engineer e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaint> getResolvedComplaintsByDate(Engineer e, LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaint> getComplaints(Engineer e, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeComplaintStatus(int complaintId) {
		// TODO Auto-generated method stub
		return null;
	}

}
