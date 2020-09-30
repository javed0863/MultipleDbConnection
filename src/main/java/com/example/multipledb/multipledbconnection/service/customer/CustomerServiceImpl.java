package com.example.multipledb.multipledbconnection.service.customer;

import com.example.multipledb.multipledbconnection.entity.customer.Customer;
import com.example.multipledb.multipledbconnection.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = customerRepository.findAll();
        customers.forEach(System.out::println);
        return customers;
    }
}
