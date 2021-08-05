package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.entities.Complaint;
import com.src.entities.Product;
import com.src.exceptions.InValidModelNumberException;
import com.src.repository.IProductRepository;
@Service
public class IProductServiceImpl implements IProductService{
    @Autowired
	IProductRepository repository;
    
   // @Autowired
   // IComplaintRepository repo;
	@Override
	public void addProduct(Product product) {
	    repository.save(product);
		}

	@Override
	public List<Product> getProduct(String categoryName) {
		return repository.getProduct(categoryName);
		
	}

	@Override
	public void removeProducts(String category) {
	    repository.removeProducts(category);
	}
/*
	@Override
	public List<Complaint> getProductComplaints(String productCategoryName) {
		
		List<Complaint> list=new List<Complaint>();
		
	List<Complaint> complaints=repo.getClientAllComplaints(client);
	List<Product> pdlst=repository.getProduct(productCategoryName);
        for(Complaint c:complaints) {
        	for(Product p:pdlst) {
        		if(p.getModelNumber()==c.getproductModelNumber()) {
        			list.add(c);
        		}
        	}
        	}
        
		return list;
	}
*/
}

