package com.xworkz.formAndDto.service;


import com.xworkz.formAndDto.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService{

    DeathCertificateServiceImpl(){
        System.out.println("created DeathCertificateServiceImpl");
    }


    @Override
    public boolean validateAndSave(DeathCertificateDto dto) {
        System.out.println("validating and saving:"+dto);
        return true;
    }
}
