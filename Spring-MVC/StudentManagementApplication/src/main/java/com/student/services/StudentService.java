package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.entity.Student;
import com.student.repo.IStudentRepository;

public class StudentService implements IStudentService {
	
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public Integer saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent.getsId();
	}

}
