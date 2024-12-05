package com.xworkz.formAndDto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.formAndDto")
public class FormDtoConfiguration {
    FormDtoConfiguration(){
        System.out.println("created FormDtoConfiguration");
    }

}
