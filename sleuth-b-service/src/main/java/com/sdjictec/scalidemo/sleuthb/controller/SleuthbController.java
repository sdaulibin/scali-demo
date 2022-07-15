package com.sdjictec.scalidemo.sleuthb.controller;

import com.sdjictec.scalidemo.sleuthb.service.SleuthcServiceFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SleuthbController {
    @Resource
    private SleuthcServiceFeignClient sleuthcServiceFeignClient;

    @GetMapping("/sleuthb")
    @ResponseBody
    public String methodB(){
        String result = sleuthcServiceFeignClient.methodC();
        result = " -> Service Sleuth B" + result;
        return result;
    }
}
