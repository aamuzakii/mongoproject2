package com.salatin.mongoproject2.controller;

import com.salatin.mongoproject2.exception.CategoryNotFoundException;
import com.salatin.mongoproject2.model.Category;
import com.salatin.mongoproject2.model.Product;
import com.salatin.mongoproject2.repository.CategoryRepository;
import com.salatin.mongoproject2.repository.ProductRepository;
import com.salatin.mongoproject2.serializer.ProductSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public ArrayList<ProductSerializer> getAllProduct() {
        List<Product> aa = productRepository.findAll();
        ArrayList<ProductSerializer> coll = new ArrayList<ProductSerializer>();
        aa.forEach((Product item) -> {
              ProductSerializer single = new ProductSerializer(item);
              String cate_id = item.getCategory_id();
              if (cate_id != null) {
              System.out.println(cate_id != null);
              Optional<Category> category  = categoryRepository.findById(item.getCategory_id());
                single.setCategory(category);
            }
            coll.add(single);
        });


      return coll;
    }
}