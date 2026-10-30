package com.example.springstartupdemo.Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void sumSmallNumbers(){
        assertEquals( 5,calculatorService.sum(2,3));
        assertEquals( 3,calculatorService.sum(-4,7));
    }

    @Test
    void largeSum(){
        assertEquals(1000, calculatorService.sum(500, 500));
    }
}
