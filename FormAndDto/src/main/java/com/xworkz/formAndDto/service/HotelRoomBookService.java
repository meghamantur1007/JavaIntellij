package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.HotelRoomBookingDto;
import org.springframework.stereotype.Service;

public interface HotelRoomBookService {
    boolean validateAndSave(HotelRoomBookingDto dto);
}
