package com.xworkz.formAndDto.components;

import com.xworkz.formAndDto.dto.MatrimonyDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MatrimonyComponent {
    MatrimonyComponent(){
        System.out.println("created MatrimonyComponent");
    }
    @RequestMapping("/matrimony")
    public String onPress(MatrimonyDto dto){
        System.out.println("running onPress in MatrimonyComponent");
        System.out.println("Matrimony form:"+dto.toString());
        return "Matrimony.jsp";
    }
}
