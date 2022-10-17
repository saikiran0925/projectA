
package com.projecta.in.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projecta.in.entity.Student;
import com.projecta.in.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		 return studentRepository.save(student);
		
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
		
	}

}
