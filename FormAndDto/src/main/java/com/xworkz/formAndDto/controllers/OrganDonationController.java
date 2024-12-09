package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.OrganDonationDto;
import com.xworkz.formAndDto.service.OrganDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganDonationController {

    @Autowired
    OrganDonationService organDonationService;

    OrganDonationController(){
        System.out.println("created OrganDonationComponent");
    }
    @RequestMapping("/organDonation")
    public String onPress(OrganDonationDto dto){
        System.out.println("running onPress in OrganDonationComponent");
        System.out.println("OrganDonation Form:"+dto.toString());
        boolean saved=organDonationService.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "OrganDonation.jsp";
    }
}
