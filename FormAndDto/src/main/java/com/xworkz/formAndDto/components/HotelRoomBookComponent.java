package com.xworkz.formAndDto.components;

import com.xworkz.formAndDto.dto.HotelRoomBookingDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HotelRoomBookComponent {
    HotelRoomBookComponent(){
        System.out.println("created HotelRoomBookComponent");
    }
    @RequestMapping("/hotelRoom")
    public String onPress(HotelRoomBookingDto dto){
        System.out.println("Room Booking for:"+dto.toString());
        return "HotelRoomBooking.jsp";
    }
}
