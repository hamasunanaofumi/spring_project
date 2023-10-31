package com.example.demo.minus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

    @Autowired
    private MinusService minusService;

    @GetMapping("/minus")
    public String showCalculator() {
        return "minus.html";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = minusService.minus(num1, num2); 
        model.addAttribute("result", result);
        return "minus.html";
    }
}
