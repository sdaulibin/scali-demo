package com.sdjictec.scalidemo.sleutha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SleuthaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthaApplication.class,args);
    }
}
