package com.projecta.in.services;

import java.util.List;

import com.projecta.in.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	void deleteStudentById(int id);
	
	Student getStudentById(int id);
}
