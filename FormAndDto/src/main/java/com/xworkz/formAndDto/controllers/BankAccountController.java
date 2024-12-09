package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.BankAccountDto;
import com.xworkz.formAndDto.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    BankAccountController(){
        System.out.println("created BankAccountController");
    }

    @RequestMapping("/bankAccount")
    public String onSave(BankAccountDto bankAccountDto){
        System.out.println("Bank Account dto:"+bankAccountDto.toString());
        boolean saved=bankAccountService.validateAndSave(bankAccountDto);
        if (saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "BankAccount.jsp";
    }
}
