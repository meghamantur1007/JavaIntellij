package com.xworkz.springMvc.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Laptop {

    @Autowired
    @Qualifier("teamName")
    String team;
    Laptop(){
        System.out.println("created Laptop");
    }
    @PostConstruct
    void print(){
        System.out.println(team);
    }
}
