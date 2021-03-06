package com.salatin.mongoproject2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salatin.mongoproject2.exception.CategoryNotFoundException;
import com.salatin.mongoproject2.model.Order;
import com.salatin.mongoproject2.repository.OrderRepository;

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