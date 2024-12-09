package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.MatrimonyDto;
import org.springframework.stereotype.Service;

public interface MatrimonyService {
    boolean validateAndSave(MatrimonyDto matrimonyDto);
}
