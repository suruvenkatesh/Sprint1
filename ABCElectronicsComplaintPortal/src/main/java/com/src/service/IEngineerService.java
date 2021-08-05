package com.src.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.src.entities.Complaint;
import com.src.entities.Engineer;


@Service
public interface IEngineerService {

	
	public List<Complaint> getAllOpenComplaints(Engineer e);
	public List<Complaint> getResolvedComplaints(Engineer e);
	public List<Complaint> getResolvedComplaintsByDate(Engineer e,LocalDate date);
	public List<Complaint> getComplaints(Engineer e,String status);
	public String changeComplaintStatus(int complaintId); // returns updated Status;
	
}
