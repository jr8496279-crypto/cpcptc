package com.curd.cpcwithapi10.repository;

import org.springframework.data.repository.CrudRepository;

import com.curd.cpcwithapi10.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
