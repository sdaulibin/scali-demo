package com.sdjictec.scalidemo.sleuthc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthcController {
    @GetMapping("/sleuthc")
    public String methodC(){
        String result = " -> Service Sleuth C";
        return result;
    }
}
