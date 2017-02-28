package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DegreeController {

		public DegreeController() {
		}
		
		@Autowired
		private DegreeService degServ;
		
		@RequestMapping(method=RequestMethod.GET,value="/students/{id}/degrees")
		public List<Degree> getAllDegrees(@PathVariable int id){
			return degServ.getAllDegrees(id);
		}
		
		@RequestMapping(method=RequestMethod.GET,value="/students/{id}/degrees/{degreeId}")
		public Degree getDegree(@PathVariable int id,@PathVariable String degreeId){
			return degServ.getDegree(degreeId);
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/students/{id}/degrees")
		public void addDegree(@RequestBody Degree degree, @PathVariable int id, String degreeId){
			degree.setStudent(new Student(id,"",""));
			degServ.addDegree(degree);
		}
		
		@RequestMapping(method=RequestMethod.PUT,value="/students/{id}/degrees/{degreeId}")
		public void updateDegree(@RequestBody Degree degree,@PathVariable int id, @PathVariable String degreeId){
			degree.setStudent(new Student(id,"",""));
			degServ.updateDegree(degree);
		}

		@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}/degrees/{degreeId}")
		public void deleteStudent(@PathVariable int id,@PathVariable String degreeId){
			degServ.deleteDegree(degreeId);
		}
	}


