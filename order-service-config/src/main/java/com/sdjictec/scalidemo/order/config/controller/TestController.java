package com.sdjictec.scalidemo.order.config.controller;

import com.sdjictec.scalidemo.order.config.config.CustomConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
//    @Value("${custom.flag}")
//    private String flag;
//    @Value("${custom.database}")
//    private String database;
    @Resource
    private CustomConfig customConfig;
    @GetMapping("/test")
    public String test(){
        return "flag:" + customConfig.getFlag() + "<br/> database:" + customConfig.getDatabase();
    }
}
