package com.sdjictec.scalidemo.sleutha.controller;

import com.sdjictec.scalidemo.sleutha.service.SleuthbServiceFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SleuthaController {
    @Resource
    private SleuthbServiceFeignClient sleuthbServiceFeignClient;

    @GetMapping("/sleutha")
    public String methodA(){
        String result = sleuthbServiceFeignClient.methodB();
        result = " -> Service Sleuth A" + result;
        return result;
    }
}
