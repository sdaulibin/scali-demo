package com.sdjictec.scalidemo.sentinel.nacos;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SentinelNacosApplication {
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosApplication.class,args);
    }
}
