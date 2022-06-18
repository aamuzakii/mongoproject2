package com.salatin.mongoproject2;

import com.salatin.mongoproject2.exception.CategoryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> findCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Category findOneCategories(@PathVariable String id) {
        return categoryRepository.findById(id).orElseThrow(()-> new CategoryNotFoundException(id));
    }
}
