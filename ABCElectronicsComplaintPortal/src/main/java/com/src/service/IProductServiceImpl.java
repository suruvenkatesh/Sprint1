
package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.DuplicateProductException;
import com.src.exceptions.InValidModelNumberException;
import com.src.repository.IProductRepository;
@Service
public class IProductServiceImpl implements IProductService{
    @Autowired
	IProductRepository repository;

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProducts(String category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getProduct(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductWarranty(String modelNumber) throws InValidModelNumberException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Complaint> getProductComplaints(String productCategoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Engineer> getEngineersByProduct(String productCategoryName) {
		// TODO Auto-generated method stub
		return null;
	}
}
	/*
    @Override
	public void addProduct(Product product) {
		List<Product>list=repository.findAll();
		for(Product a:list) {
			if(((a.equals(product)))) 
			throw new DuplicateProductException("Product with model number  "+a+" already exists");
	    repository.addProduct(product);
		}
	}

	@Override
	public void removeProducts(String category) {
	List<Product>list=repository.findAll();
	for(Product a:list) {
		if(!((a.getProductCategoryName()).equals(category))) {
			throw new DuplicateProductException("Product with model number "+a.getProductName() +"does not exists");
		}
	repository.removeProducts(category);
	}
	}

	@Override
	public List<Product> getProduct(String categoryName) {
	
		return repository.getProduct(categoryName);
		
	}

	@Override
	public void updateProductWarranty(String modelNumber){
		List<Product>list=repository.findAll();
		for(Product a:list) {
			if(a.getModelNumber().equals(modelNumber)) {
		repository.updateProductWarranty(modelNumber);
		}
			else
			{
				throw new InValidModelNumberException("Model number with "+modelNumber+" Invalid");
			}
		}
	}
	@Override
	public List<Complaint> getProductComplaints(String productCategoryName) {
		
		return repository.getProductComplaints(productCategoryName);
	}

	@Override
	public List<Engineer> getEngineersByProduct(String productCategoryName) {
	
		return repository.getEngineersByProduct(productCategoryName);
	}

	*/



