package com.example.springstartupdemo.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    public long sum(int first, int second){
        int result = first + second;
        return result;
    }

    public long sumAll(List<Integer> values){
        int total = 0;
        for(int i : values){
            total = total+i;
        }
        return total;
    }
}
