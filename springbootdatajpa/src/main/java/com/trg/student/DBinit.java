package com.trg.student;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.trg.student.data.Student;
import com.trg.student.repo.StudentRepository;

@Component
public class DBinit implements CommandLineRunner {

	@Autowired
	StudentRepository repo;
	
	Logger logger = LoggerFactory.getLogger(DBinit.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		
		
		logger.info("All records are deleted from table");
		
		repo.save(new Student(100,"venkatesh",LocalDate.of(1998, 04, 28),90));
		repo.save(new Student(200,"pavan",LocalDate.of(2000, 07, 12),90));
		repo.save(new Student(300,"kumar",LocalDate.of(2004,8,17),90));
		
		logger.info( repo.count()+ "records are inserted into table");
	
	}

}
