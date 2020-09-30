package com.example.multipledb.multipledbconnection.service.product;

import com.example.multipledb.multipledbconnection.entity.product.Product;
import com.example.multipledb.multipledbconnection.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        products.forEach(System.out::println);

        return products;
    }
}
