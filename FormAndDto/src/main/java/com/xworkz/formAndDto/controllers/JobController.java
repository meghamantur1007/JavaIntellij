package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.JobDto;
import com.xworkz.formAndDto.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JobController {

    @Autowired
    JobService service;

    JobController(){
        System.out.println("created JobComponent");
    }

    @RequestMapping("/submit")
    public String onPress(JobDto dto){
        System.out.println("running onPress in JobComponent");
        System.out.println("Job Application:"+ dto.toString());
        boolean saved=service.validateAndSave(dto);
        if (saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }

        return "Job.jsp";
    }
}
