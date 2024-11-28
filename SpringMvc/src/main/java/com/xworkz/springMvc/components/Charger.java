package com.xworkz.springMvc.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:pasta.properties")
public class Charger {

    @Value("${dataBaseUserName}")
    String user;

    @Value("${dbPassword}")
    String password;

    @PostConstruct
    void print(){
        System.out.println("UserName:"+user);
        System.out.println("password:"+password);

    }
}
