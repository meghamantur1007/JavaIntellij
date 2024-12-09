package com.xworkz.formAndDto.service;

import com.xworkz.formAndDto.dto.HotelRoomBookingDto;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomBookServiceImpl implements HotelRoomBookService{

    HotelRoomBookServiceImpl(){
        System.out.println("created HotelRoomBookServiceImpl");
    }

    @Override
    public boolean validateAndSave(HotelRoomBookingDto dto) {
        System.out.println("Validating and saving data:"+dto);
        return true;
    }
}
