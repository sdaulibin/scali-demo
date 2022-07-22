package com.sdjictec.scalidemo.tmmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TmMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(TmMallApplication.class,args);
    }
}
