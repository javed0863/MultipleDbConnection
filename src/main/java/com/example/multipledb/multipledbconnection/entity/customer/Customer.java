package com.example.multipledb.multipledbconnection.entity.customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "customerdb", name = "customer")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
    @Id
    private int id;

    private String name;

    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
