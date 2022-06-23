package com.salatin.mongoproject2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salatin.mongoproject2.model.Customer;
import com.salatin.mongoproject2.repository.CustomerRepository;

@RestController
@RequestMapping("customers")
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @GetMapping
  public List<Customer> getAllOrder() {
    return customerRepository.findAll();
  }
}
