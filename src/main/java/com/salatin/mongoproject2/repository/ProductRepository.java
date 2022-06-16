package com.salatin.mongoproject2.repository;

import com.salatin.mongoproject2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
