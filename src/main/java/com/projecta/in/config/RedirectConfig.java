package com.projecta.in.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projecta.in.entity.Student;
import com.projecta.in.services.StudentServiceImpl;

@RestController
public class RedirectConfig {
	@Autowired
	private StudentServiceImpl studentService;

	@PostMapping("/savestudent")
	public ModelAndView saveStudent(@ModelAttribute("student") Student student) {
		ModelAndView mv = new ModelAndView("redirect:/students");
		studentService.saveStudent(student);
		return mv;
	}
	@GetMapping("/savestudent/{id}")
	public ModelAndView saveStudentById(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", studentService.getStudentById(id));
		mv.setViewName("studentform");
		return mv;
	}
	

	@GetMapping("/deletestudent/{id}")
	public ModelAndView deleteStudentById(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("redirect:/students");
		studentService.deleteStudentById(id);
		return mv;
	}
}
