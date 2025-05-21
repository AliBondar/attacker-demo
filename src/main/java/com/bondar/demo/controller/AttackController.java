package com.bondar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttackController {

    @GetMapping("/gift")
    public String gift() {
        return "gift";
    }

    @GetMapping("/attack")
    public String attack() {
        return "attack";
    }

}
