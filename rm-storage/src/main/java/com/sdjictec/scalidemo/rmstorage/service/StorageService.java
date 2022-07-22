package com.sdjictec.scalidemo.rmstorage.service;

import com.sdjictec.scalidemo.rmstorage.entity.Storage;
import com.sdjictec.scalidemo.rmstorage.repository.StorageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class StorageService {
    @Resource
    private StorageRepository storageRepository;
    @Transactional
    public Storage reduceStorage(Integer goodsId, Integer quantity){
        Storage storage = storageRepository.findById(goodsId).get();
        if(storage.getQuantity() < quantity){
            throw new IllegalStateException(goodsId + "商品库存不足");
        }
        storage.setQuantity(storage.getQuantity() - quantity);
        return storageRepository.save(storage);
    }
}
