package com.sdjictec.scalidemo.tmmall.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//积分服务客户端
@FeignClient("rm-points")
public interface PointsFeignClient {
    @GetMapping("/add_points")
    public String addPoints(@RequestParam("memberId") Integer memberId, @RequestParam("points") Integer points);

}

