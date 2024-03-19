package com.example.demo.controllers;

import com.example.demo.service.HomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    HomeService exampleService;

    public CalcController(HomeService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping("/reverse-number")
    public String reverseNumber(
            @RequestParam String number
    ) {
        return exampleService.reverseNumber(number);
    }

    @PostMapping("/palindrom")
    public String palindrom(
        @RequestParam String text
    ) {
        return exampleService.isPalindrom(text);
    }

    @PostMapping("/avg-number")
    public String avgNumber(
            @RequestParam int avgnumber
    ) {
        return exampleService.avgNumber(avgnumber);
    }
}
