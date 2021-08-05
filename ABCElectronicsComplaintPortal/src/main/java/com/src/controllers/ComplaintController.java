package com.src.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.src.entities.Client;
import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidComplaintIdException;
import com.src.exceptions.OutofWarrantyException;
import com.src.service.IComplaintService;
import com.src.service.IProductService;

public class ComplaintController {

	@RestController
	@RequestMapping("/complaint")
	public class ProductController {
		@Autowired
	    IComplaintService complaintService;
		
		@PostMapping("/bookComplaint")
		public ResponseEntity<?> bookComplaint(@PathVariable Client client,@PathVariable Complaint complaint,@PathVariable Product product)throws OutofWarrantyException{
		  boolean complaintobj = complaintService.bookComplaint(client, complaint, product);
			return new ResponseEntity<>(complaintobj,HttpStatus.CREATED) ;
		}
		@PutMapping("{complaintId}/{status}")
		public String changeComplaintStatus(@PathVariable Complaint complaintId) {
			 return complaintService.changeComplaintStatus(complaintId);			
		}
		
		@GetMapping("/getClientAllComplaints/{client}")
		public List<Complaint> getClientAllComplaints(@PathVariable Client client){
			return complaintService.getClientAllComplaints(client);
		}
		@GetMapping("/getClientAllopenComplaints/{client}")
		public List<Complaint> getClientAllOpenComplaints(@PathVariable Client client){
			return complaintService.getClientAllOpenComplaints(client);
		}
		@GetMapping("/getEngineer/{complaintId}")
		public Engineer getEngineer(@PathVariable int complaintId)throws InValidComplaintIdException{
			return complaintService.getEngineer(complaintId);
		}
		@GetMapping("/getProductByComplaint/{complaintId}")
		public Complaint getProductByComplaint(@PathVariable int complaintId)throws InValidComplaintIdException{
			return complaintService.getProductByComplaint(complaintId);
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
