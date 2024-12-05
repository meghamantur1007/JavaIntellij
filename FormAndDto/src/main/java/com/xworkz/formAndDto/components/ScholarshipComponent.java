package com.xworkz.formAndDto.components;

import com.xworkz.formAndDto.dto.ScholarshipDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component

@RequestMapping("/")
public class ScholarshipComponent {
    ScholarshipComponent(){
        System.out.println("created ScholarshipComponent");
    }

    @RequestMapping("/apply")
    public String onPress(ScholarshipDto scholarshipDto){
        System.out.println("running onPress in ScholarshipComponent");
        System.out.println("Schlorship for:"+ scholarshipDto.toString());
        return "Scholarship.jsp";
    }


}
