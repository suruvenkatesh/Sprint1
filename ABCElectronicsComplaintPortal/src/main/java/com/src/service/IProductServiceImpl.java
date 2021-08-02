package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidModelNumberException;
import com.src.repository.IProductRepository;
@Service
public class IProductServiceImpl implements IProductService{
    @Autowired
	IProductRepository repository;
	@Override
	public void addProduct(Product product) {
	repository.addProduct(product);
	}

	@Override
	public void removeProducts(String category) {
	repository.removeProducts(category);
		
	}

	@Override
	public List<Product> getProduct(String categoryName) {
	
		return repository.getProduct(categoryName);
		
	}

	@Override
	public void updateProductWarranty(String modelNumber) throws InValidModelNumberException {
		repository.updateProductWarranty(modelNumber);
		
	}

	@Override
	public List<Complaint> getProductComplaints(String productCategoryName) {
		
		return repository.getProductComplaints(productCategoryName);
	}

	@Override
	public List<Engineer> getEngineersByProduct(String productCategoryName) {
	
		return repository.getEngineersByProduct(productCategoryName);
	}

}

