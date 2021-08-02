package com.trg.student.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.trg.student.data.Student;



@Repository
@Configuration
@Service
public interface StudentRepository extends JpaRepository<Student, Integer >{

	
}
