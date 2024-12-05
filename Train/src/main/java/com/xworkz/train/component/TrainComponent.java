package com.xworkz.train.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TrainComponent {
    TrainComponent(){
        System.out.println("created TrainComponent");
    }
    @RequestMapping("press")
    public String onPress(){
        System.out.println("running onPress in TrainComponent");
        return "index.jsp";
    }

}
