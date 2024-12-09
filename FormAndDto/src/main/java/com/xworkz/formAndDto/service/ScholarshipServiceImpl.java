package com.xworkz.formAndDto.service;


import com.xworkz.formAndDto.dto.ScholarshipDto;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl implements ScholarshipService{
    ScholarshipServiceImpl(){

        System.out.println("created ScholarshipServiceImpl");
    }

    @Override
    public boolean validateAndSave(ScholarshipDto scholarshipDto) {
        System.out.println("Validating and saving data:"+scholarshipDto);
        return true;
    }
}
