package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{

    JobServiceImpl(){
        System.out.println("created JobServiceImpl");
    }

    @Override
    public boolean validateAndSave(JobDto dto) {
        System.out.println("Validating and saving data:"+dto);

        return true;
    }
}
