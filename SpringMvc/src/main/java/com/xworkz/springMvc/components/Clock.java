package com.xworkz.springMvc.components;

import org.springframework.stereotype.Component;

@Component
public class Clock {
    Clock(){
        System.out.println("created Clock");
    }
}
