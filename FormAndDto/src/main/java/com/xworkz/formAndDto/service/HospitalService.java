package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.HospitalDto;

public interface HospitalService {
    boolean validateAndSave(HospitalDto dto);
}
