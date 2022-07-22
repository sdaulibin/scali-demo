package com.sdjictec.scalidemo.tmmall.controller;

import com.sdjictec.scalidemo.tmmall.service.MallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MallController {
    @Resource
    private MallService mallService;
    @GetMapping("/sale")
    public String sale(Integer orderId,Integer memberId,Integer goodsId,Integer points,Integer quantity){
        return mallService.sale(orderId,memberId,goodsId,points,quantity);
    }

}

