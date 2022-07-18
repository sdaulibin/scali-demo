package com.sdjictec.scalidemo.sleuthb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sleuthc-service")
public interface SleuthcServiceFeignClient {
    @GetMapping("/sleuthc")
    public String methodC();
}
