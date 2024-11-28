package com.xworkz.springMvc.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringComponent {


    @Autowired
    @Qualifier("teamName")
    String team;
    SpringComponent(){
        System.out.println("created SpringComponent");
    }
    @PostConstruct
    void print(){
        System.out.println(team);
    }

}
