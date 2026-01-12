package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public Double add(@RequestParam Double num1, @RequestParam(defaultValue = "4") Integer num2){
        return  num1+num2;
    }

    @GetMapping("/sub/{num111}/{num2}")
    public Double subtract(@PathVariable("num111") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if(num1 > num2){
            result = num1 - num2;
        }else{
            result = num2 - num1;
        }

        return  result;
    }

}
