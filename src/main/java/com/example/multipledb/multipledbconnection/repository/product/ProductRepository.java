package com.example.multipledb.multipledbconnection.repository.product;

import com.example.multipledb.multipledbconnection.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
