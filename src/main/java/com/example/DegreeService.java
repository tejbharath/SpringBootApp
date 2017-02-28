package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DegreeService {

	public DegreeService() {
	}
	
	@Autowired
	private DegreeRepository degRep;
	
	// List all Degree
	public List<Degree> getAllDegrees(int id) {
		List<Degree> degree = new ArrayList<Degree>();
		degRep.findByStudentId(id).
		forEach(degree::add);
		return degree;
	}
	
	// Add Degree
	public void addDegree(Degree degree)
	{
		degRep.save(degree);
	}
	
	// Remove a Degree
	public void deleteDegree(String degreeId)
	{
		degRep.delete(degreeId);
	}
	
	// Update a Degree
	public void updateDegree(Degree degree){
         degRep.save(degree);     
	}
	
	// Get a Degree
	
	public Degree getDegree(String degreeId)
	{
		return degRep.findOne(degreeId);
	}


}
