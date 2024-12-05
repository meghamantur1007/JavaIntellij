package com.xworkz.formAndDto.components;

import com.xworkz.formAndDto.dto.JobDto;
import com.xworkz.formAndDto.dto.ScholarshipDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class JobComponent {
    JobComponent(){
        System.out.println("created JobComponent");
    }

    @RequestMapping("/submit")
    public String onPress(JobDto dto){
        System.out.println("running onPress in JobComponent");
        System.out.println("Job Application:"+ dto.toString());
        return "Job.jsp";
    }
}
