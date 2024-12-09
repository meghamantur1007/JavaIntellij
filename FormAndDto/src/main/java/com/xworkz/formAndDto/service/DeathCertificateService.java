package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.DeathCertificateDto;

public interface DeathCertificateService {
    boolean validateAndSave(DeathCertificateDto dto);
}
