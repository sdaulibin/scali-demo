package com.sdjictec.scalidemo.sleuthb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SleuthbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthbApplication.class,args);
    }
}
