package com.xworkz.formAndDto.components;

import com.xworkz.formAndDto.dto.OrganDonationDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OrganDonationComponent {
    OrganDonationComponent(){
        System.out.println("created OrganDonationComponent");
    }
    @RequestMapping("/organDonation")
    public String onPress(OrganDonationDto dto){
        System.out.println("running onPress in OrganDonationComponent");
        System.out.println("OrganDonation Form:"+dto.toString());
        return "OrganDonation.jsp";
    }
}
