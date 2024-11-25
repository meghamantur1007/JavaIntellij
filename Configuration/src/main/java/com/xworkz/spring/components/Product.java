package com.xworkz.spring.components;

import org.springframework.stereotype.Component;

@Component
public class Product {
    Product(){
        System.out.println("Product is created");
    }
}
