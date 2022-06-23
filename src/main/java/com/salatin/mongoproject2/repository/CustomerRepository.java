package com.salatin.mongoproject2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salatin.mongoproject2.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>  {
  
}
