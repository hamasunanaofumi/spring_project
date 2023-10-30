package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	 private final CalculatorService calculatorService;

	    public CalculatorController(CalculatorService calculatorService) {
	        this.calculatorService = calculatorService;
	    }

	    @GetMapping("/calculator")
	    public String showCalculator() {
	        return "calculator.html";
	    }

	    @PostMapping("/calculator")
	    public String calculate(@RequestParam int num1, @RequestParam String operator, @RequestParam int num2, Model model) {
	        int result = 0;
	        if (operator.equals("plus")) {
	            result = calculatorService.plus(num1, num2);
	        } else if (operator.equals("minus")) {
	            result = calculatorService.minus(num1, num2);
	        } else if (operator.equals("multi")) {
	            result = calculatorService.multi(num1, num2);
	        } else if (operator.equals("div")) {
	            result = calculatorService.div(num1, num2);
	        }
	        model.addAttribute("result", result);
	        return "calculator.html";
	    }

}