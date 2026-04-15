package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserSpaceController {

    @GetMapping("/user")
    public String index(Model model) {
        model.addAttribute("title", "Espace membre");
        return "user/index";
    }
}
