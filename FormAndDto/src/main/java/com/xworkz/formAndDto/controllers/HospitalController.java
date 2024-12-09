package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.HospitalDto;
import com.xworkz.formAndDto.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    HospitalService service;
    HospitalController(){
        System.out.println("created HospitalController");
    }

    @RequestMapping("/hospital")
    public String onSave(HospitalDto hospitalDto){
        System.out.println("Hospital Dto:"+hospitalDto.toString());
        boolean saved=service.validateAndSave(hospitalDto);
        if(saved){
            System.out.println("data is saved");
        }
        else{
            System.out.println("data is not saved");
        }
        return "Hospital.jsp";
    }
}
