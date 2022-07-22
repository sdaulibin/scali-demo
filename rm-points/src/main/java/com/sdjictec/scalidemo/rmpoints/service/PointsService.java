package com.sdjictec.scalidemo.rmpoints.service;

import com.sdjictec.scalidemo.rmpoints.entity.Points;
import com.sdjictec.scalidemo.rmpoints.repository.PointsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class PointsService {
    @Resource
    private PointsRepository pointsRepository;
    @Transactional
    public Points addPoints(Integer memberId,Integer points){
        Points entity = pointsRepository.findById(memberId).get();
        entity.setPoints( entity.getPoints() + points);
        return pointsRepository.save(new Points(memberId,entity.getPoints()));
    }
}
