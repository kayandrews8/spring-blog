package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/partials")
public class PartialsController {

    @GetMapping
    public String showPartials(){
        return "views-lecture/partials-test";
    }
}
