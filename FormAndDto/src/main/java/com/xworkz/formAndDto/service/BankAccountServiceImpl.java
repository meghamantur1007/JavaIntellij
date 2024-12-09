package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.BankAccountDto;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    BankAccountServiceImpl(){
        System.out.println("created BankAccountServiceImpl");
    }

    @Override
    public boolean validateAndSave(BankAccountDto bankAccountDto) {
        System.out.println("validating and saving bankDto:"+bankAccountDto);
        return true;
    }
}
