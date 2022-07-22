package com.sdjictec.scalidemo.rmpoints.repository;

import com.sdjictec.scalidemo.rmpoints.entity.Points;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointsRepository extends JpaRepository<Points,Integer> {
}
