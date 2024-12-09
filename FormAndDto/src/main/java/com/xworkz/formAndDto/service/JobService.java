package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.JobDto;
import org.springframework.stereotype.Service;

public interface JobService {
    boolean validateAndSave(JobDto dto);
}
