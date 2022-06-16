package com.salatin.mongoproject2.controller;

import com.salatin.mongoproject2.model.Product;
import com.salatin.mongoproject2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getAllProduct() {
      return productRepository.findAll();
    }
}