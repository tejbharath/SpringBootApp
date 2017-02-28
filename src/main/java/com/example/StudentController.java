package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	public StudentController() {
	}
	
	@Autowired
	private StudentService studserv;
	
	@RequestMapping(method=RequestMethod.GET,value="/students")
	public List<Student> getAllStudents(){
		return studserv.getAllStudents();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/students/{id}")
	public Student getStudent(@PathVariable int id){
		return studserv.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addStudent(@RequestBody Student student, int id){
		studserv.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id){
		studserv.updateStudent(student);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}")
	public void deleteStudent(@PathVariable int id){
		studserv.deleteStudent(id);
	}
		
}
