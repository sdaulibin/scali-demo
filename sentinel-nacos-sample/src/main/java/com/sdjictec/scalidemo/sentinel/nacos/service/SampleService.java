package com.sdjictec.scalidemo.sentinel.nacos.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    //资源点名称为createOrder
    @SentinelResource("createOrder")
    /**
     * 模拟创建订单业务
     * 抛出IllegalStateException异常用于模拟业务逻辑执行失败的情况
     */
    public void createOrder() throws IllegalStateException{
        try {
            //模拟处理业务逻辑需要101毫秒
            Thread.sleep(101);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已创建");
    }
}
