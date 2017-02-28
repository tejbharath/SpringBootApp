package com.example;


import org.springframework.data.repository.CrudRepository;

interface StudentRepository extends CrudRepository<Student,Integer>
{
}
