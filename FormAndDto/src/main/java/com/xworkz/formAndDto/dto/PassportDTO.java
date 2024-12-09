package com.xworkz.formAndDto.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@NoArgsConstructor

public class PassportDTO {
    private String registerAt; //
    private String passportOffice;
    private String givenName;
    private String surname;
    private String dob;
    private String email;
    private boolean loginIdChoice;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;


}