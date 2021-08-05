package com.src.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "eng_tbl")
public class Engineer {
	
	@Id
	private int employeeId; // treat like login id
	
	@Length(min = 5, max = 20)
	private String password;
	private String engineerName;
	private String domain; // like washing machine , AC, Mobile phone
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "engineerId" ,targetEntity = Engineer.class)

//	private List<Complaint> complaints = new ArrayList<>();



	
	
}
