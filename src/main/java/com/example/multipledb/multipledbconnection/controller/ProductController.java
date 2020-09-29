package com.example.multipledb.multipledbconnection.controller;

import com.example.multipledb.multipledbconnection.entity.product.Product;
import com.example.multipledb.multipledbconnection.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAllProducts(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}
