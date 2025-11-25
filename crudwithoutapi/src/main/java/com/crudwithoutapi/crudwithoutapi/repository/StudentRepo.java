package com.crudwithoutapi.crudwithoutapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudwithoutapi.crudwithoutapi.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
