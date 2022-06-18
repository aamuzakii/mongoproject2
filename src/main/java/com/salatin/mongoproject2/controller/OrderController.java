package com.salatin.mongoproject2.controller;

import com.salatin.mongoproject2.exception.CategoryNotFoundException;
import com.salatin.mongoproject2.model.Order;
import com.salatin.mongoproject2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping
    public List<Order> getAllOrder() {
      return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order findOne(@PathVariable String id) {
        return orderRepository.findById(id).orElseThrow(()-> new CategoryNotFoundException(id));
    }
}