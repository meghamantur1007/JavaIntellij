package com.xworkz.formAndDto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrganDonationDto {
    private String donorName;
    private String dob;
    private String bloodGroup;
    private String contact;
    private String email;
    private String organ;
    private String address;
    private String guardianName;
    private String guardianContact;
    private String relation;
}
