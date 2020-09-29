package com.example.multipledb.multipledbconnection.entity.product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "productdb", name = "product")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
    @Id
    private int id;

    private String name;

    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
