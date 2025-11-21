package com.mongocpc.mongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongocpc.mongocrud.model.Customer;

public interface CustRepo extends MongoRepository<Customer, Integer>{

}
