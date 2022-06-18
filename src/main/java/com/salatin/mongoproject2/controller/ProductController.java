package com.salatin.mongoproject2.controller;

import com.salatin.mongoproject2.model.Product;
import com.salatin.mongoproject2.repository.ProductRepository;
import com.salatin.mongoproject2.serializer.ProductSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ArrayList<ProductSerializer> getAllProduct() {
        List<Product> aa = productRepository.findAll();
        ArrayList<ProductSerializer> coll = new ArrayList<ProductSerializer>();
        aa.forEach((Product item) -> {
            System.out.println(item.toString());
            ProductSerializer single = new ProductSerializer(item);
            coll.add(single);
        });


      return coll;
    }
}