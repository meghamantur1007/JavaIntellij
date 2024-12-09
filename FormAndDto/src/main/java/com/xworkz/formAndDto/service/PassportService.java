package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.PassportDTO;

public interface PassportService {
    boolean validateAndSave(PassportDTO dto);
}
