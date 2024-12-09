package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.ScholarshipDto;
import com.xworkz.formAndDto.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholarshipController {

    @Autowired
    ScholarshipService scholarshipService;
    ScholarshipController(){
        System.out.println("created ScholarshipComponent");
    }

    @RequestMapping("/apply")
    public String onPress(ScholarshipDto scholarshipDto){
        System.out.println("running onPress in ScholarshipComponent");
        System.out.println("Schlarship for:"+ scholarshipDto.toString());
        boolean saved=scholarshipService.validateAndSave(scholarshipDto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "Scholarship.jsp";
    }


}
