package com.example.SberORMMVCRecipes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String index(Model model){
       model.addAttribute("name", "User");
        return  "greeting";

    }

}
