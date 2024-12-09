package com.xworkz.formAndDto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HospitalDto {
    private String hospitalName;
    private String location;
    private String speciality;
    private long  phNumber;
    private int capacity;

}
