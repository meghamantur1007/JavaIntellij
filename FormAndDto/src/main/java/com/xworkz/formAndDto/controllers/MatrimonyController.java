package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.MatrimonyDto;
import com.xworkz.formAndDto.service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MatrimonyController {

    @Autowired
    MatrimonyService matrimonyService;

    MatrimonyController(){
        System.out.println("created MatrimonyComponent");
    }
    @RequestMapping("/matrimony")
    public String onPress(MatrimonyDto dto){
        System.out.println("running onPress in MatrimonyComponent");
        System.out.println("Matrimony form:"+dto.toString());
        boolean saved=matrimonyService.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "Matrimony.jsp";
    }
}
