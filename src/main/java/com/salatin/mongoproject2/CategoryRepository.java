package com.salatin.mongoproject2;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.salatin.mongoproject2.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
