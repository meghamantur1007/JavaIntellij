package com.xworkz.formAndDto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobDto {
    private String name;
    private String dob; // Date of Birth in String format (could use LocalDate if needed)
    private String email;
    private String contact;
    private String address;
    private String qualification;
    private String experience;
    private String skills;
    private String preferredLocation;
    private String jobRole;
}
