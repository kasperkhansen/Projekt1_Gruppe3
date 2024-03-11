package com.example.projekt1_gruppe3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AdventureQuizController {

    @GetMapping("/AdventureQuiz")
    public String adventureQuiz() {
        return "AdventureQuiz"; // This is the name of the html file to be returned
    }

}
