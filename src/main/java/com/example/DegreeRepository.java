package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface DegreeRepository extends CrudRepository<Degree,String>
{
	public List<Degree> findByStudentId(int id);
}

