package com.src.service;

import java.time.LocalDate;
import java.util.List;

import com.src.entities.Complaint;
import com.src.entities.Engineer;



public interface IEngineerService {

	
	public List<Complaint> getAllOpenComplaints(Engineer e);
	public List<Complaint> getResolvedComplaints(Engineer e);
	public List<Complaint> getResolvedComplaintsByDate(Engineer e,LocalDate date);
	public List<Complaint> getComplaints(Engineer e,String status);
	public String changeComplaintStatus(int complaintId); // returns updated Status;
	
	
}
