package com.src.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.src.entities.Complaint;
import com.src.entities.Engineer;
import com.src.entities.Product;
import com.src.exceptions.InValidModelNumberException;

public interface IProductRepository extends JpaRepository<Product, String> {

	@Transactional
	@Modifying
	@Query("delete from Product p where p.productCategoryName = :category ")
	public void removeProducts(@Param("category") String category);
	
	@Transactional
	@Modifying
	@Query("select u from Product u where u.productCategoryName = :categoryName")
	public List<Product> getProduct(@Param("categoryName") String categoryName);
	
	
	/*
	
	public void updateProductWarranty(String modelNumber)throws InValidModelNumberException;

	
	public List<Complaint> getProductComplaints(String productCategoryName);
	
	
	public List<Engineer> getEngineersByProduct(String productCategoryName);
	
	
	*/
}
