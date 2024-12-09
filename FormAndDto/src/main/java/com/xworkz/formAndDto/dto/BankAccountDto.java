package com.xworkz.formAndDto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccountDto {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
}
