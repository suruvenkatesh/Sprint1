package com.trg.student.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.trg.crud.exceptions.StudentException;
import com.trg.student.data.Student;
import com.trg.student.repo.StudentRepository;

@Service
public class StudentDaoJpaImpl implements StudentDao {

	@Autowired

	private StudentRepository repo;
	
	@Override
	public void save(Student s) throws StudentException {
		// TODO Auto-generated method stub
		if(repo.existsById(s.getStudentId())) {
			throw new StudentException("Student with id:" + s.getStudentId()+ " already exists.");
		}
		else {
			repo.save(s);
		}
		
	}

	@Override
	public void update(Student s) throws StudentException {
		// TODO Auto-generated method stub
		if(repo.existsById(s.getStudentId())) {
			repo.save(s);
	
		}
		else {
			throw new StudentException("Student with id:" + s.getStudentId()+ " does not exists.");		
		}
		
	}

	@Override
	public void delete(int sid) throws StudentException {
		// TODO Auto-generated method stub
		if(repo.existsById(sid)) {
			repo.deleteById(sid);
	
		}
		else {
			throw new StudentException("Student with id:" + sid+ " does not exists.");		
		}

	}

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Optional<Student> opt = repo.findById(sid);
		Student s = null;
		if(opt.isPresent())
			s= opt.get();
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		ArrayList<Student> list = (ArrayList<Student>) repo.findAll();
		return list;
	}

}
