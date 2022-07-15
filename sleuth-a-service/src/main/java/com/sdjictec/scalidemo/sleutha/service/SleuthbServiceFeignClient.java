package com.sdjictec.scalidemo.sleutha.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sleuth-b-service")
public interface SleuthbServiceFeignClient {
    @GetMapping("/sleuthb")
    public String methodB();
}
