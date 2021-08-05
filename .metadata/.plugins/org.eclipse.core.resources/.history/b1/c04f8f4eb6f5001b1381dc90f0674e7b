package com.src;


import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.src.entities.Product;
import com.src.repository.IProductRepository;
import com.src.service.IProductServiceImpl;
@Component
public class DBInit implements CommandLineRunner {

	@Autowired
	IProductServiceImpl repo;
	
	@Autowired
	IProductRepository r;
	
	Logger logger = LoggerFactory.getLogger(DBInit.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		logger.info("H2 datbase product created");

		Product p=new Product();
		p.setProductName("fan");
		p.setModelNumber("IME45654");
        p.setProductCategoryName("Electrical");
        p.setDateofPurchase(LocalDate.now());
        p.setWarrantyDate(LocalDate.of(2030, 10, 12));
        p.setWarrentyYears(6);
        r.save(p);
        
    	p.setProductName("mixer");
		p.setModelNumber("IME123546");
        p.setProductCategoryName("Electrical");
        p.setDateofPurchase(LocalDate.now());
        p.setWarrantyDate(LocalDate.of(2029, 11, 10));
        p.setWarrentyYears(4);
        r.save(p);


		logger.info("2 products inserted into database");

		

	}
	
}
