package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.BankAccountDto;
import org.springframework.stereotype.Service;

public interface BankAccountService {
    boolean validateAndSave(BankAccountDto bankAccountDto);
}
