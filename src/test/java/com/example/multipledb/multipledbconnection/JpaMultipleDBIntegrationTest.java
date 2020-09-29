package com.example.multipledb.multipledbconnection;

import com.example.multipledb.multipledbconnection.entity.customer.Customer;
import com.example.multipledb.multipledbconnection.entity.product.Product;
import com.example.multipledb.multipledbconnection.repository.customer.CustomerRepository;
import com.example.multipledb.multipledbconnection.repository.product.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement
public class JpaMultipleDBIntegrationTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    @Transactional("customerTransactionManager")
    public void creatingCustomerAndVerify() {
        Customer customer = new Customer("Faiz",25);
        customer = customerRepository.save(customer);

        assertNotNull(customerRepository.findById(customer.getId()));
    }

    @Test
    @Transactional("productTransactionManager")
    public void creatingProductAndVerify() {
        Product product = new Product("iPhone", 1800);
        product = productRepository.save(product);

        assertNotNull(productRepository.findById(product.getId()));
    }
}
