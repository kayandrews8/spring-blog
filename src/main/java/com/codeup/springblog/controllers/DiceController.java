package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/roll-dice")
public class DiceController {

    @GetMapping
    public String landing(){
        return "roll-dice";
    }

    @GetMapping("/{num}")
    public String rollDice(@PathVariable int num, Model model){
        Random random = new Random();
        int randomNumber = random.nextInt(7);

        model.addAttribute("num",num);
        model.addAttribute("randomNumber", randomNumber);

        return "roll-dice";
    }

}
