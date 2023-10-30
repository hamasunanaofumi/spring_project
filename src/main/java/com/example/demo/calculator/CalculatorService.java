package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	  public int plus(int num1, int num2) {
	        int result = num1 + num2;
	        return result;
	    }

	    public int minus(int num1, int num2) {
	    	int result = num1 - num2;
			 return result;
	    }

	    public int multi(int num1, int num2) {
	    	int result = num1 * num2;
	        return result;
	    }

	    public int div(int num1, int num2) {
	        if (num2 == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero");
	        }
	        int result = num1 / num2;
	        return result;
	    }
}