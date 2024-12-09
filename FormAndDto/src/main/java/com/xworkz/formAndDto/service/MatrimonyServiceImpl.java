package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.MatrimonyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements MatrimonyService{

    MatrimonyServiceImpl(){
        System.out.println("created MatrimonyServiceImpl");
    }

    @Override
    public boolean validateAndSave(MatrimonyDto matrimonyDto) {
        System.out.println("Validating and saving data:"+matrimonyDto);
        return true;
    }
}
