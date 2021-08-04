package com.src.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity  
@Table(name="prd_tbl") //It creates a table in database with name as prd_tbl.
public class Product {
	//It is required and length should be in between 5 and 10 otherwise it throws custom error message as given.
	@Id
	@NotNull(message = "model number is Required")
	@Length(min = 5, max = 10,message="Length of model number should be betwwen 5 and 10")
	private String modelNumber;
	
	//It is required.
	@NotNull(message = "product Name is Required")
	private String productName;

	//It is required.
	@NotNull(message = "product category Name is Required")
	private String productCategoryName; // washing machine , TV,AC,SmartPhone
	
	private LocalDate dateofPurchase;
	
	
	private int warrentyYears;
	
	private LocalDate warrantyDate; // should be auto generated
	
	//Default constructor 
	public Product() {
		super();
	}
	//Parameterized constructor
	public Product(String modelNumber, String productName, String productCategoryName, LocalDate dateofPurchase,
			int warrentyYears, LocalDate warrantyDate ) {
		
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.dateofPurchase = dateofPurchase;
		this.warrentyYears = warrentyYears;
		this.warrantyDate = warrantyDate;
	}
	// Method is used to get the model number
	public String getModelNumber() {
		return modelNumber;
	}
	// Method is used to set the model number.
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	// Method is used to get the product name.
	public String getProductName() {
		return productName;
	}
	// Method is used to set the product name.
	public void setProductName(String productName) {
		this.productName = productName;
	}
	// Method is used to get product category name.
	public String getProductCategoryName() {
		return productCategoryName;
	}
	// Method is used to set the product category name.
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	// Method is used to get the date of purchase.
	public LocalDate getDateofPurchase() {
		return dateofPurchase;
	}
	// Method is used to set the date of purchase.
	public void setDateofPurchase(LocalDate dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	// Method is used to get the warranty years
	public int getWarrentyYears() {
		return warrentyYears;
	}
	// Method is used to set the warranty years.
	public void setWarrentyYears(int warrentyYears) {
		this.warrentyYears = warrentyYears;
	}
	// Method is used to get the warranty date.
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	// Method is used to set the warranty date.
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

}
