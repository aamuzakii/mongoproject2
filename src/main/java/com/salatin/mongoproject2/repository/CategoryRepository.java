package com.salatin.mongoproject2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.salatin.mongoproject2.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
