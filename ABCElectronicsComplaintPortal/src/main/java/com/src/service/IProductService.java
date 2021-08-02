package com.src.service;

import java.util.List;

import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidModelNumberException;

public interface IProductService {
	
	public void addProduct(Product product);
	public void removeProducts(String category);
	public List<Product> getProduct(String categoryName);
	
	public void updateProductWarranty(String modelNumber)throws InValidModelNumberException;
	
	public List<Complaint> getProductComplaints(String productCategoryName);
	public List<Engineer> getEngineersByProduct(String productCategoryName);
	
	
	
}
