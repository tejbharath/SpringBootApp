package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="Degree")

public class Degree {

	@ManyToOne
	private Student student;
	
	public Degree() {
	}
    
	@Id 
    private String degreeId;
    
	private String degreeName;
    private String deanName;
    
	public Degree(String degreeId, String degreeName, String deanName,int studentId) {
		super();
		this.degreeId = degreeId;
		this.degreeName = degreeName;
		this.deanName = deanName;
		this.student=new Student(studentId,"","");
	}
	
	public String getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(String degreeId) {
		this.degreeId = degreeId;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getDeanName() {
		return deanName;
	}
	public void setDeanName(String deanName) {
		this.deanName = deanName;
	}

	public void setStudent(Student student) {
		this.student=student;
		
	}
    
    
}
