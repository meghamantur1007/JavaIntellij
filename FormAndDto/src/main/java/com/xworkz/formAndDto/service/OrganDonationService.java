package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.OrganDonationDto;
import org.springframework.stereotype.Service;


public interface OrganDonationService {
    boolean validateAndSave(OrganDonationDto organDonationDto);
}
