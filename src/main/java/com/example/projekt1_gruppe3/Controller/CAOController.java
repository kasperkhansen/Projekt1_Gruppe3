package com.example.projekt1_gruppe3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class CAOController {
    @GetMapping("/Company")
    public String bmiCalculator(){ return "Company";
    }

}

