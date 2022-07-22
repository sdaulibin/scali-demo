package com.sdjictec.scalidemo.rmorder.service;

import com.sdjictec.scalidemo.rmorder.emtity.Order;
import com.sdjictec.scalidemo.rmorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class OrderService {
    @Resource
    private OrderRepository orderRepository;
    @Transactional
    public Order createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer points, Integer quantity){
        return orderRepository.save(new Order(orderId, memberId,goodsId,points,quantity));
    }

}

