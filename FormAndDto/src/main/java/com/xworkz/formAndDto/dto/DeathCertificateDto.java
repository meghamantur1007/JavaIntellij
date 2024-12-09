package com.xworkz.formAndDto.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeathCertificateDto {

    private String deceasedName;
    private String deceasedAge;
    private String deceasedAddress;
    private String deceasedDob;
    private String deceasedLastDate;
    private String deceasedCause;
}
