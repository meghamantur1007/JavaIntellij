package com.xworkz.formAndDto.service;


import com.xworkz.formAndDto.dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{
    HospitalServiceImpl(){
        System.out.println("created HospitalServiceImpl");
    }


    @Override
    public boolean validateAndSave(HospitalDto dto) {
        System.out.println("validating and saving hospitalDto"+dto);
        return true;
    }
}
