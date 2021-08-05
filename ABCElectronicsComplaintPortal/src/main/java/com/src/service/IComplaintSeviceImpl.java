package com.src.service;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.entities.Client;
import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidComplaintIdException;
import com.src.exceptions.InValidModelNumberException;
import com.src.exceptions.OutofWarrantyException;
import com.src.repository.IComplaintRepository;
import com.src.repository.IEngineerRepository;
import com.src.repository.IProductRepository;

@Service
public class IComplaintSeviceImpl implements IComplaintService {

	@Autowired
	IComplaintRepository complaintRepository;
	// @Autowired
		private Complaint complaint;
		

		@Autowired
		IProductRepository productRepository;
	@Autowired
	IEngineerRepository engineerRepository;

	Logger logger = LoggerFactory.getLogger(IComplaintSeviceImpl.class);
/*
	
	// @Autowired
	private Product product;
	
	// @Autowired
	private String modelNumber;

	// @Autowired
	private Complaint complaint;

	@Autowired
	IProductRepository productRepository;
*/
	@Override
	public boolean bookComplaint(Client client, Complaint complaint, Product product) throws OutofWarrantyException {
		return false;
		
		
	}
	@Override
	public String changeComplaintStatus(Complaint complaintId) {
		return "status";
	}

	@Override
	public List<Complaint> getClientAllComplaints(Client client) {
		return complaintRepository.findAll();
	}

	@Override
	public List<Complaint> getClientAllOpenComplaints(Client client) {
		String status = complaint.getStatus();
		if (status == "open") {
		List<Complaint> list= complaintRepository.findAll();
		return list;
		}
		return null;
	}
	@Override
	public Engineer getEngineer(int complaintId) throws InValidComplaintIdException {
		Optional<Complaint> complaint=complaintRepository.findById(complaintId);
		if(complaint.isPresent()) {
	      System.out.println(engineerRepository.findById(complaintId));
	     }
		else 
			throw new InValidComplaintIdException();
	return null;
}
			
	@Override
	public Complaint getProductByComplaint(int complaintId) throws InValidComplaintIdException {
		Optional<Complaint> product = complaintRepository.findById(complaintId);
		if (!product.isPresent())
			throw new InValidComplaintIdException();
		 return product.get();
}
}
