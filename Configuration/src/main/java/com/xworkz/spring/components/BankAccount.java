package com.xworkz.spring.components;

import org.springframework.stereotype.Component;

@Component
public class BankAccount {
    BankAccount(){
        System.out.println("BankAccount is created");
    }
}
