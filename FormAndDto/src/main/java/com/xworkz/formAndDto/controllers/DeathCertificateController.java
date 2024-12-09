package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.DeathCertificateDto;
import com.xworkz.formAndDto.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {

    @Autowired
    DeathCertificateService service;
    DeathCertificateController(){
        System.out.println("created DeathCertificateController");
    }

    @RequestMapping("/deceased")
    public String onSave(DeathCertificateDto dto){
        System.out.println("DeathCertificateDto:"+dto.toString());
        boolean saved=service.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("not saved");
        }
        return "DeathCertificate.jsp";
    }
}

