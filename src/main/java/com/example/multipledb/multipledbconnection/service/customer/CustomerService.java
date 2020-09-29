package com.example.multipledb.multipledbconnection.service.customer;

import com.example.multipledb.multipledbconnection.entity.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
