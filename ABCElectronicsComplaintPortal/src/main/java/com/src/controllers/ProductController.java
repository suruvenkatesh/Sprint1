package com.src.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.entities.Product;
import com.src.exceptions.NullProductsException;
import com.src.service.IProductService;


@RestController
@RequestMapping("produts")
public class ProductController {
	@Autowired
    IProductService service;
	@PostMapping
	public String saveProduct(@Valid @RequestBody Product product) {
		service.addProduct(product);
		return "Product added successfully";
	}
	
	@DeleteMapping("{category}")
	public String removeProducts(@Valid @PathVariable("category") String category) {
		service.removeProducts(category);
		return "Product deleted successfully";
	}
	
	@GetMapping("{categorylist}")
	public List<Product> getProduct(@Valid @PathVariable("categorylist") String categoryName){
		List<Product> list = service.getProduct(categoryName);
		if (list.size() == 0)
			throw new NullProductsException("No Products found");
	return service.getProduct(categoryName);
	}
	/*
	 @GetMapping("{productcomplaints}")
	  public List<Complaint> getProductComplaints(@Valid @PathVariable("productcomplaints") String productCategoryName) {
	  List<Complaint> list=service.getProductComplaints(getProductComplaints);
	  if (list.size() == 0){
			throw new NullProductsException("No Complaints found");
	  }
	  else{
	  return service.getProductComplaints(getProductComplaints);
	  }
	  }
	  */
	
}
