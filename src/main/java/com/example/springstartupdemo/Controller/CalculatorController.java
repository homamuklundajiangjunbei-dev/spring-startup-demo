package com.example.springstartupdemo.Controller;

import com.example.springstartupdemo.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("calc/sum")
    public long sum(@RequestParam int a, @RequestParam int b){
        return calculatorService.sum(a,b);
    }
}
