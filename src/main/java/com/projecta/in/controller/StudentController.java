package com.projecta.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projecta.in.entity.Student;
import com.projecta.in.services.StudentServiceImpl;

@RestController

public class StudentController {
	@Autowired
	private StudentServiceImpl studentService;
	
	@GetMapping("/students")
	public ModelAndView getAllStudents(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", studentService.getAllStudents());
		mv.setViewName("studentslist");
		return mv;
	}
	

	
	@GetMapping("/studentform")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView();
		Student student = new Student();
		mv.addObject("student", student);
		mv.setViewName("studentform");;
		return mv;
	}

}
