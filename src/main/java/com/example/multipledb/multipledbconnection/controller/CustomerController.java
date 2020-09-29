package com.example.multipledb.multipledbconnection.controller;

import com.example.multipledb.multipledbconnection.entity.customer.Customer;
import com.example.multipledb.multipledbconnection.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> findAllCustomers(){
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
