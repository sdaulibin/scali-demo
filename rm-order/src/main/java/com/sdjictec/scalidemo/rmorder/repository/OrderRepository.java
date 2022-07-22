package com.sdjictec.scalidemo.rmorder.repository;

import com.sdjictec.scalidemo.rmorder.emtity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
