package com.salatin.mongoproject2.repository;

import com.salatin.mongoproject2.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public class ProductRepository extends MongoRepository<Category, String> {
}
