package com.xworkz.train.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.train")
@EnableWebMvc
public class TrainConfiguration1 {
    TrainConfiguration1(){
        System.out.println("created TrainConfiguration1");
    }

}
