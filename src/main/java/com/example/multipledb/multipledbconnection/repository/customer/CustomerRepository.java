package com.example.multipledb.multipledbconnection.repository.customer;

import com.example.multipledb.multipledbconnection.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
