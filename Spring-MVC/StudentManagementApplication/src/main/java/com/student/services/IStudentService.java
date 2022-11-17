package com.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repo.IStudentRepository;


public interface IStudentService {
	
	Integer saveStudent (Student student);
	
	Optional<Student> getStudent(Integer id);
	
	public List<Student> getAllStudents();
;
}
