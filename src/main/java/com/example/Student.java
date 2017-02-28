package com.example;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="Student")

class Student {
      
	@Id 
	@GeneratedValue
	private int id;
	
	
	private String name;
	private String degree;
	 

	protected Student() { //default constructor
	}

	public Student(int id, String name, String degree)
	{
		this.name=name;
		this.id=id;
		this.degree=degree;
	}
			
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree +"]";
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDegree(String degree){
		this.degree=degree;
	}
	
	public String getDegree(){
		return degree;
	}
   	
}


