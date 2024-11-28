package com.xworkz.springMvc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springMvc")
public class SpringConfig {
    SpringConfig(){
        System.out.println("created SpringConfig");
    }

    @Bean
    public String teamName(){
        System.out.println("created teamName");
        return "rcb";
    }
    @Bean
    public String ownerName(){
        System.out.println("created ownerName");
        return "bangalore";
    }

}
