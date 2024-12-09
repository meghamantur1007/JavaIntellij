package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.OrganDonationDto;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService{
    OrganDonationServiceImpl(){
        System.out.println("created OrganDonationServiceImpl");
    }

    @Override
    public boolean validateAndSave(OrganDonationDto organDonationDto) {
        System.out.println("Validating and saving data:"+organDonationDto);
        return true;
    }
}
