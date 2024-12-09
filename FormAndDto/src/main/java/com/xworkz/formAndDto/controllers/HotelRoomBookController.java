package com.xworkz.formAndDto.controllers;

import com.xworkz.formAndDto.dto.HotelRoomBookingDto;
import com.xworkz.formAndDto.service.HotelRoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HotelRoomBookController {

    @Autowired
    HotelRoomBookService hotelRoomBookService;

    HotelRoomBookController(){
        System.out.println("created HotelRoomBookComponent");
    }
    @RequestMapping("/hotelRoom")
    public String onPress(HotelRoomBookingDto dto){
        System.out.println("Room Booking for:"+dto.toString());
        boolean saved=hotelRoomBookService.validateAndSave(dto);
        if(saved){
            System.out.println("data saved");
        }
        else{
            System.out.println("data is not saved");
        }
        return "HotelRoomBooking.jsp";
    }
}
