package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studrep;

	
	// List all Students
	public List<Student> getAllStudents() {
		List<Student> student = new ArrayList<Student>();
		studrep.findAll().
		forEach(student::add);
		return student;
	}
	
	// Add Student
	public void addStudent(Student student)
	{
		studrep.save(student);
	}
	
	// Remove a Student
	public void deleteStudent(int id)
	{
		studrep.delete(id);
	}
	
	// Update a Student
	public void updateStudent(Student student){
         studrep.save(student);     
	}
	
	// Get a Student
	
	public Student getStudent(int id)
	{
		return studrep.findOne(id);
	}

}
